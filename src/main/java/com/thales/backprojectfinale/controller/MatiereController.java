package com.thales.backprojectfinale.controller;

import com.thales.backprojectfinale.dao.MatiereDao;
import com.thales.backprojectfinale.dao.SalleClasseDao;
import com.thales.backprojectfinale.model.Matiere;
import com.thales.backprojectfinale.model.SalleClasse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
	public Matiere GetMatiereById(@PathVariable Integer codeMat) {
		return dao.findById(codeMat).get();
	}

	@DeleteMapping("/delete/{code}")
	public void delMatiere(@PathVariable Integer codeMat) {
		dao.deleteById(codeMat);
	}

	@GetMapping({"", "/"})
	public List<Matiere> matieres() {
		return this.dao.findAll();
	}

}
