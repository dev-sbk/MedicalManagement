package com.epi.j2ee.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.epi.j2ee.domain.Patient;
import com.epi.j2ee.service.IGenericService;

@Controller
@RequestMapping(value = "/patient")
public class PatientCtrl {
	@Autowired
	private IGenericService<Patient> metier;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String home(Model model) {
		return "docteur/home";
	}

	public IGenericService<Patient> getMetier() {
		return metier;
	}

	public void setMetier(IGenericService<Patient> metier) {
		this.metier = metier;
	}

}
