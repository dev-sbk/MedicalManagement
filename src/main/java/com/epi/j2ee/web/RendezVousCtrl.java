package com.epi.j2ee.web;

import com.epi.j2ee.domain.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.epi.j2ee.domain.RendezVous;
import com.epi.j2ee.domain.User;
import com.epi.j2ee.metier.IGenericService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.PathVariable;
@Controller
@RequestMapping(value = "/admin/rendezvous")
public class RendezVousCtrl {
    @Autowired
    private IGenericService<RendezVous> metier;
    @Autowired
    private IGenericService<Patient> metierPat;
    private RendezVous rendezvous=new RendezVous();
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String homeAction(Model model,HttpServletRequest request) {
        HttpSession sess = request.getSession();
        User user = (User) sess.getAttribute("user");
        model.addAttribute("user", user);
        model.addAttribute("menuActive", "rendezvous-content");
        model.addAttribute("patients", metierPat.findAll(Patient.class));
        model.addAttribute("rdv", getRendezVous());
        model.addAttribute("rdvs", filterListByDate());
        return "index";
    }
   @RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
    public String add(HttpServletRequest request) throws ParseException {
        Patient pat=metierPat.find(Patient.class, Integer.parseInt(request.getParameter("idPat")));
        RendezVous r = new RendezVous();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date dateRDV=sdf.parse(request.getParameter("dateRDV"));
        r.setDateRDV(dateRDV);
        r.setHeureRDV(request.getParameter("heureRDV"));
        r.setSujetRDV(request.getParameter("sujetRDV"));
        r.setStatus("ATTENTE");
        r.setPatient(pat);
        metier.insert(r);
        setRendezVous(new RendezVous());
        return "redirect:/admin/rendezvous/index";
    }
    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable int id) {
        RendezVous rdv=metier.find(RendezVous.class, id);
        rdv.setStatus("ACTIVER");
        metier.update(rdv);
        return "redirect:/admin/rendezvous/index";
    }
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        metier.delete(metier.find(RendezVous.class, id));
        return "redirect:/admin/rendezvous/index";
    }
    /**
     * Cette methode permet de filter la liste de rendez-vous selon la dataRDV
     * @return 
     */
    private List<RendezVous> filterListByDate(){
        List<RendezVous> data=metier.findAll(RendezVous.class);
        for(int i=0;i<data.size();i++){
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date date = sdf.parse(sdf.format(new Date()));
                if(data.get(i).getDateRDV().before(date)){
                    metier.delete(data.get(i));
                    data.remove(i);
                }
            } catch (ParseException ex) {
                Logger.getLogger(RendezVousCtrl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return data;
    }
    public IGenericService<RendezVous> getMetier() {
        return metier;
    }

    public void setMetier(IGenericService<RendezVous> metier) {
        this.metier = metier;
    }

    public RendezVous getRendezVous() {
        return rendezvous;
    }

    public void setRendezVous(RendezVous rendezvous) {
        this.rendezvous = rendezvous;
    }
}
