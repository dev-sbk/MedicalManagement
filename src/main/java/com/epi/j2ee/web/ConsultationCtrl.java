package com.epi.j2ee.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.epi.j2ee.domain.Consultation;
import com.epi.j2ee.domain.Patient;
import com.epi.j2ee.domain.User;
import com.epi.j2ee.metier.IGenericService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping(value = "/admin/consultation")
public class ConsultationCtrl {

    @Autowired
    private IGenericService<Consultation> metier;
    @Autowired
    private IGenericService<Patient> metierPat;
    private Consultation consultation = new Consultation();
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String homeAction(Model model, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        User user = (User) sess.getAttribute("user");
        model.addAttribute("user", user);
        model.addAttribute("menuActive", "consultation-content");
        model.addAttribute("consult", getConsultation());
        model.addAttribute("consults", metier.findAll(Consultation.class));
        return "index";
    }

    @RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
    public String add(Model model, HttpServletRequest request) throws ParseException {
        HttpSession sess = request.getSession();
        Patient p = metierPat.find(Patient.class, Integer.parseInt(request.getParameter("idPat")));
        Consultation c = new Consultation();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateCons = sdf.parse(request.getParameter("dateCons"));
        c.setDateCons(dateCons);
        c.setSujetCons(request.getParameter("sujetCons"));
        c.setHeureCons(request.getParameter("heureCons"));
        c.setTraitementCons(request.getParameter("traitementCons"));
        c.setDiagCons(request.getParameter("diagCons"));
        c.setRepos(request.getParameter("repos"));
        c.setPatient(p);
        metier.insert(c);
        sess.setAttribute("consultation", c);
        return "redirect:/admin/ordonnance/index";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        metier.delete(metier.find(Consultation.class, id));
        return "redirect:/admin/consultation/index";
    }

    public IGenericService<Consultation> getMetier() {
        return metier;
    }

    public void setMetier(IGenericService<Consultation> metier) {
        this.metier = metier;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }
}
