package com.epi.j2ee.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.epi.j2ee.domain.Docteur;
import com.epi.j2ee.domain.Role;
import com.epi.j2ee.domain.User;
import com.epi.j2ee.metier.IGenericService;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/admin/docteur")
public class DocteurCtrl {

    @Autowired
    private IGenericService<Docteur> metier;
    @Autowired
    private IGenericService<Role> metierRole;
    private Docteur docteur = new Docteur();

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String home(Model model, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        User user = (User) sess.getAttribute("user");
        model.addAttribute("user", user);
        model.addAttribute("menuActive", "docteur-content");
        model.addAttribute("docteur", getDocteur());
        model.addAttribute("docteurs", metier.findAll(Docteur.class));
        return "index";
    }

    @RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
    public String add(HttpServletRequest request) {

        try {
            Docteur d = getDocteur();
            if (d.getUsername() != null) {
                d.setPassword(request.getParameter("password"));
                d.setNom(request.getParameter("nom"));
                d.setPrenom(request.getParameter("prenom"));
                d.setAdresse(request.getParameter("adresse"));
                d.setTel(request.getParameter("tel"));
                d.setEnabled(true);
                metier.update(d);
            } else {
                d.setUsername(request.getParameter("username"));
                d.setPassword(request.getParameter("password"));
                d.setNom(request.getParameter("nom"));
                d.setPrenom(request.getParameter("prenom"));
                d.setAdresse(request.getParameter("adresse"));
                d.setTel(request.getParameter("tel"));
                d.setEnabled(true);
                List<Role> roles = new ArrayList<Role>();
                roles.add(metierRole.find(Role.class, "ROLE_DOCTEUR"));
                d.setRoles(roles);
                metier.insert(d);
            }

        } catch (Exception ex) {
        }
        setDocteur(new Docteur());
        return "redirect:/admin/docteur/index";
    }

    @RequestMapping("/edit/{username}")
    public String edit(@PathVariable String username) {
        setDocteur(metier.find(Docteur.class, username));
        return "redirect:/admin/docteur/index";
    }

    @RequestMapping("/delete/{username}")
    public String delete(@PathVariable String username) {
        metier.delete(metier.find(Docteur.class, username));
        setDocteur(new Docteur());
        return "redirect:/admin/docteur/index";
    }

    public IGenericService<Docteur> getMetier() {
        return metier;
    }

    public void setMetier(IGenericService<Docteur> metier) {
        this.metier = metier;
    }

    public Docteur getDocteur() {
        return docteur;
    }

    public void setDocteur(Docteur docteur) {
        this.docteur = docteur;
    }

}
