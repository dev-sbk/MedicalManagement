package com.epi.j2ee.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.epi.j2ee.domain.Assistante;
import com.epi.j2ee.domain.Role;
import com.epi.j2ee.domain.User;
import com.epi.j2ee.metier.IGenericService;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/admin/assistante")
public class AssistanteCtrl {

    @Autowired
    private IGenericService<Assistante> metier;
    @Autowired
    private IGenericService<Role> metierRole;
    private Assistante assistante = new Assistante();

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String home(Model model, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        User user = (User) sess.getAttribute("user");
        model.addAttribute("user", user);
        model.addAttribute("menuActive", "assistante-content");
        model.addAttribute("assistante", getAssistante());
        model.addAttribute("assistantes", metier.findAll(Assistante.class));
        return "index";
    }

    @RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
    public String add(HttpServletRequest request) {
        try {
            Assistante a = getAssistante();
            if (a.getUsername() != null) {
                a.setPassword(request.getParameter("password"));
                a.setNom(request.getParameter("nom"));
                a.setPrenom(request.getParameter("prenom"));
                a.setAdresse(request.getParameter("adresse"));
                a.setTel(request.getParameter("tel"));
                a.setEnabled(true);
                metier.update(a);
            } else {
                a.setUsername(request.getParameter("username"));
                a.setPassword(request.getParameter("password"));
                a.setNom(request.getParameter("nom"));
                a.setPrenom(request.getParameter("prenom"));
                a.setAdresse(request.getParameter("adresse"));
                a.setTel(request.getParameter("tel"));
                a.setEnabled(true);
                List<Role> roles = new ArrayList<Role>();
                roles.add(metierRole.find(Role.class, "ROLE_ASSISTANTE"));
                a.setRoles(roles);
                metier.insert(a);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        setAssistante(new Assistante());
        return "redirect:/admin/assistante/index";
    }
    @RequestMapping("/edit/{username}")
    public String edit(@PathVariable String username) {
        setAssistante(metier.find(Assistante.class, username));
        return "redirect:/admin/assistante/index";
    }

    @RequestMapping("/delete/{username}")
    public String delete(@PathVariable String username) {
        metier.delete(metier.find(Assistante.class, username));
        setAssistante(new Assistante());
        return "redirect:/admin/assistante/index";
    }

    public IGenericService<Assistante> getMetier() {
        return metier;
    }

    public void setMetier(IGenericService<Assistante> metier) {
        this.metier = metier;
    }

    public Assistante getAssistante() {
        return assistante;
    }

    public void setAssistante(Assistante assistante) {
        this.assistante = assistante;
    }

}
