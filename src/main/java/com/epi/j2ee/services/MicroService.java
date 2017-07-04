/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epi.j2ee.services;
import com.epi.j2ee.domain.Patient;
import com.epi.j2ee.domain.RendezVous;
import com.epi.j2ee.metier.IGenericService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@Service
@RestController
@RequestMapping(value = "/medical-service")
public class MicroService {
    @Autowired
    private IGenericService<Patient> metier;
    @Autowired
    private IGenericService<RendezVous> metierRdv;
    @RequestMapping(value = "/getAllPatients", method = RequestMethod.GET)
    public @ResponseBody
    List<Patient> getAllPatients() {
        return metier.findAll(Patient.class);
    }
    @RequestMapping(value = "/getPatientById/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Patient getPatientById(@PathVariable(value = "id") int id) {
        return metier.find(Patient.class, id);
    }
    @RequestMapping(value = "/getPatientByMatricule/{matricule}", method = RequestMethod.GET)
    public @ResponseBody
    Patient getPatientByMatricule(@PathVariable(value = "matricule") String matricule) {
         List<Patient> pts=metier.findAll(Patient.class, "matricule", matricule);
         for (int i=0;i<pts.size();i++) {
           if(matricule.equals(pts.get(i).getMatricule()))
            return pts.get(i);
        }
         return null;
    }
    @RequestMapping(value = "/addPatient", method = RequestMethod.POST)
    public void addPatient(Patient p){
        metier.insert(p);
    }
    @RequestMapping(value = "/addRdv", method = RequestMethod.POST)
    public void addRdv(RendezVous rdv){
        metierRdv.insert(rdv);
    }
    @RequestMapping(value = "/getAllRdv/{id}", method = RequestMethod.GET)
    public @ResponseBody
    List<RendezVous> getAllRdvByPatient(@PathVariable(value = "id") int id) {
        return metierRdv.findAll(RendezVous.class,"patient.idPat",id);
    }
}
