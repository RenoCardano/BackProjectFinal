package com.thales.backprojectfinale.controller;

import com.thales.backprojectfinale.dao.MatiereDao;
import com.thales.backprojectfinale.dao.SalleClasseDao;
import com.thales.backprojectfinale.model.Enseignant;
import com.thales.backprojectfinale.model.Matiere;
import com.thales.backprojectfinale.model.SalleClasse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping("/matiere")
public class MatiereController {

	@Autowired
	private MatiereDao dao;

	@PostMapping("")
	public void addMatiere(@RequestBody Matiere matiere) {
		dao.save(matiere);
	}


	@PutMapping({"{id}","{id}/"})
	public void updateMatiere(@RequestBody Matiere Matiere, @PathVariable Integer codeMat) {
		Matiere matiere = dao.findById(codeMat).get();
		dao.save(matiere);
	}

	@GetMapping({"{id}", "{id}/" })
	public Matiere GetEnseignantById(@PathVariable Integer id) {
		return dao.findById(id).get();
	}

	@DeleteMapping("/delete/{id}")
	public void delMatiere(@PathVariable Integer id) {
		dao.deleteById(id);
	}

	@GetMapping({"", "/"})
	public List<Matiere> matieres() {
		return this.dao.findAll();
	}

	@GetMapping({"/create"})
	public void createSamplesCategorie(){
		this.dao.save(new Matiere("S22","#123123","Maths"));
		this.dao.save(new Matiere("S02","#AA3123","Physique"));
		this.dao.save(new Matiere("L03","#12AA23","Francais"));
		this.dao.save(new Matiere("L08","#1231FF","Anglais"));
		this.dao.save(new Matiere("E34","#1231DD","Economie"));
		this.dao.save(new Matiere("E55","#12EE23","Marketing"));
	}


}
