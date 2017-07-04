package com.epi.j2ee.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
@RequestMapping(value = "/admin/patient")
public class PatientCtrl {

    @Autowired
    private IGenericService<Patient> metier;
    private Patient patient = new Patient();

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String homeAction(Model model,HttpServletRequest request) {
        HttpSession sess = request.getSession();
        User user = (User) sess.getAttribute("user");
        model.addAttribute("user", user);
        model.addAttribute("menuActive", "patient-content");
        model.addAttribute("patient", getPatient());
        model.addAttribute("patients", metier.findAll(Patient.class));
        return "index";
    }

    @RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
    public String add(HttpServletRequest request) throws ParseException {
        Patient p = new Patient();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateNaissancePat = sdf.parse(request.getParameter("dateNaissancePat"));
        p.setDateNaissancePat(dateNaissancePat);
        p.setNomPat(request.getParameter("nom"));
        p.setPrenomPat(request.getParameter("prenom"));
        p.setAdressePat(request.getParameter("adresse"));
        p.setTelPat(request.getParameter("tel"));
        p.setGenre(request.getParameter("genre"));
        p.setMatricule(request.getParameter("matricule"));
        if (Integer.parseInt(request.getParameter("id")) > 0) {
            p.setIdPat(Integer.parseInt(request.getParameter("id")));
            metier.update(p);
        } else {
            metier.insert(p);
        }
        setPatient(new Patient());
        return "redirect:/admin/patient/index";
    }

    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable int id) {
        setPatient(metier.find(Patient.class, id));
        return "redirect:/admin/patient/index";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        metier.delete(metier.find(Patient.class, id));
        setPatient(new Patient());
        return "redirect:/admin/patient/index";
    }

    public IGenericService<Patient> getMetier() {
        return metier;
    }

    public void setMetier(IGenericService<Patient> metier) {
        this.metier = metier;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

}
