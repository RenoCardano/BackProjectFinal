package com.thales.backprojectfinale.controller;

import com.thales.backprojectfinale.dao.IEnseignantDao;
import com.thales.backprojectfinale.dao.IEtablissementDao;
import com.thales.backprojectfinale.model.Enseignant;
import com.thales.backprojectfinale.model.Enseignement;
import com.thales.backprojectfinale.model.Etablissement;
import com.thales.backprojectfinale.model.SalleClasse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping("/enseignant")
public class EnseignantController {

	@Autowired
	private IEnseignantDao dao;

	@PostMapping("")
	public Enseignant addEnseignant(@RequestBody Enseignant enseignant) {
		return dao.save(enseignant);
	}


	@PutMapping({"{id}","{id}/"})
	public void updateEnseignant(@RequestBody Enseignant Enseignant, @PathVariable Integer id) {
		Enseignant enseignant = dao.findById(id).get();
		dao.save(enseignant);
	}

	@GetMapping({"{id}", "{id}/" })
	public Enseignant GetEnseignantById(@PathVariable Integer id) {
		return dao.findById(id).get();
	}

	@DeleteMapping("/delete/{id}")
	public Boolean delEnseignant(@PathVariable Integer id) {
		try {
			dao.deleteById(id);
			return true;
		} catch (Exception e ) {
			return false;
		}
	}

	@GetMapping({"", "/"})
	public List<Enseignant> enseignants() {
		return this.dao.findAll();
	}

	@GetMapping({"/create"})
	public void createSamplesEnseignant(){
		this.dao.save(new Enseignant("Jean",LocalDate.of(1989,3,11)));
		this.dao.save(new Enseignant("Jacques",LocalDate.of(1967,8,22)));
		this.dao.save(new Enseignant("Sylvie",LocalDate.of(1973,7,23)));
		this.dao.save(new Enseignant("Stéphanie",LocalDate.of(1982,10,30)));
		this.dao.save(new Enseignant("Marjolaine",LocalDate.of(1995,12,2)));
		this.dao.save(new Enseignant("Michel",LocalDate.of(1990,1,8)));
		this.dao.save(new Enseignant("Henry",LocalDate.of(1976,8,18)));
		this.dao.save(new Enseignant("Etienne",LocalDate.of(1968,2,17)));
	}

}
