package com.thales.backprojectfinale.controller;

import com.thales.backprojectfinale.dao.ICourDao;
import com.thales.backprojectfinale.dao.IEtablissementDao;
import com.thales.backprojectfinale.model.Cours;
import com.thales.backprojectfinale.model.Etablissement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cours")
public class CourController {

	@Autowired
	private ICourDao dao;

	@PostMapping("")
	public Cours addCours(@RequestBody Cours cours) {
		return dao.save(cours);
	}

	@PutMapping({"{id}","{id}/"})
	public void updateCours(@RequestBody Cours cours, @PathVariable("id") Integer id) {
		Cours coursFound = dao.findById(id).get();
		coursFound.setIdCours(cours.getIdCours());
		coursFound.setNomCour(cours.getNomCour());
		coursFound.setHeure_debut(cours.getHeure_debut());
		coursFound.setHeure_fin(cours.getHeure_fin());
		coursFound.setClasse(cours.getClasse());
		coursFound.setEnseignement(cours.getEnseignement());
		coursFound.setSalleClasse(cours.getSalleClasse());
		coursFound.setJourCours(cours.getJourCours());
		dao.save(coursFound);
	}

	@GetMapping({"{id}", "{id}/" })
	public Cours getCoursById(@PathVariable("id") Integer id) {
		return dao.findById(id).get();
	}

	@DeleteMapping("/delete/{id}")
	public Boolean delCour(@PathVariable("id") Integer id) {
		try {
			dao.deleteById(id);
			return true;
		} catch (Exception e ) {
			return false;
		}
	}

	@GetMapping({"", "/"})
	public List<Cours> coursList() {
		return this.dao.findAll();
	}

}
