package com.epi.j2ee.web;

import com.epi.j2ee.domain.Consultation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.epi.j2ee.domain.Ordonnance;
import com.epi.j2ee.domain.Patient;
import com.epi.j2ee.domain.User;
import com.epi.j2ee.metier.IGenericService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
@Controller
@RequestMapping(value = "/admin/ordonnance")
public class OrdonnanceCtrl {

    @Autowired
    private IGenericService<Ordonnance> metier;
    @Autowired
    private IGenericService<Patient> metierPat;
    @Autowired
    private IGenericService<Consultation> metierCons;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String homeAction(Model model,HttpServletRequest request) {
        HttpSession sess=request.getSession();
        Consultation cons=(Consultation) sess.getAttribute("consultation");
        User user = (User) sess.getAttribute("user");
        model.addAttribute("user", user);
        model.addAttribute("cons", cons);
        model.addAttribute("menuActive", "ordonnance-content");
        return "index";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String addOrd(HttpServletRequest request) throws ParseException {
        Ordonnance ord = new Ordonnance();
        Consultation cons=metierCons.find(Consultation.class, Integer.parseInt(request.getParameter("idCons")));
        System.out.println("************"+cons.toString());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateOrd = sdf.parse(request.getParameter("dateOrd"));
        ord.setDateOrd(dateOrd);
        ord.setDescription(request.getParameter("description"));
        ord.setConsultation(cons);
        metier.insert(ord);
        return "redirect:/admin/patient/index";
    }
    public IGenericService<Ordonnance> getMetier() {
        return metier;
    }

    public void setMetier(IGenericService<Ordonnance> metier) {
        this.metier = metier;
    }

}
