package com.emploi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.emploi.app.entities.Enseignant;
import com.emploi.app.entities.Matiere;
import com.emploi.app.entities.Salle;
import com.emploi.app.entities.Seance;
import com.emploi.service.EnseignantService;
import com.emploi.service.MatiereService;
import com.emploi.service.SalleService;
import com.emploi.service.SeanceService;
 
@Controller
public class TraitementController {
 
	@Autowired
	SalleService salleService;
	@Autowired
	EnseignantService enseignantService;
	@Autowired
	MatiereService matiereService;
	@Autowired
	SeanceService seanceService;
	@RequestMapping(value = "/home", method = RequestMethod.GET, headers = "Accept=application/json")
	public String getAllEnseignants(Model model) throws Exception {
		model.addAttribute("enseignant", new Enseignant());
		model.addAttribute("listOfEnseignants", this.enseignantService.getAll());	 
		model.addAttribute("salle", new Salle());
		model.addAttribute("listOfSalles", this.salleService.getAll());
		model.addAttribute("matiere", new Matiere());
		model.addAttribute("listOfMatieres", this.matiereService.getAll());
		model.addAttribute("seance", new Seance());
		return "Traitement";
	}
 
	@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
	public String goToHomePage() {
		return "redirect:/home";
	}
 
	@RequestMapping(value = "/addEnseignant", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addEnseignant(@ModelAttribute("enseignant") Enseignant enseignant) throws Exception {	
			enseignantService.addOrUpdate(enseignant);
 
		return "redirect:/home";
	}
 
	@RequestMapping(value = "/updateEnseignant/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String updateEnseignant(@PathVariable("id") Long id,Model model) throws Exception {
		model.addAttribute("enseignant", this.enseignantService.getEnseignant(id));
		model.addAttribute("listOfEnseignants", this.enseignantService.getAll());
		model.addAttribute("listOfSalles", this.salleService.getAll());
		model.addAttribute("salle", new Salle());
		model.addAttribute("matiere", new Matiere());
		model.addAttribute("listOfMatieres", this.matiereService.getAll());
		model.addAttribute("seance", new Seance());
		return "Traitement";
	}
	@RequestMapping(value = "/scheduleEnseignant/{id}", method = RequestMethod.GET , headers = "Accept=application/json")
	public String scheduleEnseignant(@PathVariable("id") Long id,Model model) throws Exception {
		model.addAttribute("enseignant", this.enseignantService.getEnseignant(id));
		
		return "scheldule";
	}
 
	@RequestMapping(value = "/deleteEnseignant/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String deleteEnseignant(@PathVariable("id") Long id) throws Exception {
		enseignantService.delete(enseignantService.getEnseignant(id));
		return "redirect:/home";
 
	}	
	
	@RequestMapping(value = "/addSalle", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addSalle(@ModelAttribute("salle") Salle salle) throws Exception {	
			salleService.addOrUpdate(salle);
 
		return "redirect:/home";
	}
 
	@RequestMapping(value = "/updateSalle/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String updateSalle(@PathVariable("id") Long id,Model model) throws Exception {
		model.addAttribute("salle", this.salleService.getSalle(id));
		model.addAttribute("listOfSalles", this.salleService.getAll());
		model.addAttribute("enseignant", new Enseignant());
		model.addAttribute("listOfEnseignants", this.enseignantService.getAll());
		model.addAttribute("matiere", new Matiere());
		model.addAttribute("seance", new Seance());
		model.addAttribute("listOfMatieres", this.matiereService.getAll());
		return "Traitement";
	}
 
	@RequestMapping(value = "/deleteSalle/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String deleteSalle(@PathVariable("id") Long id) throws Exception {
		salleService.delete(salleService.getSalle(id));
		return "redirect:/home";
 
	}	
	@RequestMapping(value = "/addMatiere", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addMatiere(@ModelAttribute("matiere") Matiere matiere) throws Exception {	
			matiereService.addOrUpdate(matiere);
 
		return "redirect:/home";
	}
 
	@RequestMapping(value = "/updateMatiere/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String updateMatiere(@PathVariable("id") Long id,Model model) throws Exception {
		model.addAttribute("matiere", this.matiereService.getMatiere(id));
		model.addAttribute("listOfMatieres", this.matiereService.getAll());
		model.addAttribute("enseignant", new Enseignant());
		model.addAttribute("listOfEnseignants", this.enseignantService.getAll());
		model.addAttribute("listOfSalles", this.salleService.getAll());
		model.addAttribute("salle", new Salle());
		model.addAttribute("seance", new Seance());
		return "Traitement";
	}
 
	@RequestMapping(value = "/deleteMatiere/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String deleteMatiere(@PathVariable("id") Long id) throws Exception {
		matiereService.delete(matiereService.getMatiere(id));
		return "redirect:/home";
 
	}	
	@RequestMapping(value = "/addSeance", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addSeance(@ModelAttribute("seance") @Valid Seance seance ,BindingResult bindingResult) throws Exception {	
		seanceService.addOrUpdate(seance);
		return "redirect:/home";
	}
	@RequestMapping(value = "/updateSeance/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String updateSeance(@PathVariable("id") Long id,Model model) throws Exception {
		model.addAttribute("matiere", new Matiere());
		model.addAttribute("listOfMatieres", this.matiereService.getAll());
		model.addAttribute("enseignant", new Enseignant());
		model.addAttribute("listOfEnseignants", this.enseignantService.getAll());
		model.addAttribute("listOfSalles", this.salleService.getAll());
		model.addAttribute("salle", new Salle());
		model.addAttribute("seance", new Seance());
		return "Traitement";
	}
 
	@RequestMapping(value = "/deleteSeance/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String deleteSeance(@PathVariable("id") Long id) throws Exception {
		seanceService.delete(seanceService.getSeance(id));
		return "redirect:/home";
 
	}
}