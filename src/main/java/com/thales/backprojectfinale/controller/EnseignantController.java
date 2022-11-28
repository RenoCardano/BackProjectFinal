package com.thales.backprojectfinale.controller;

import com.thales.backprojectfinale.dao.EnseignantDao;
import com.thales.backprojectfinale.dao.EnseignementDao;
import com.thales.backprojectfinale.model.Enseignant;
import com.thales.backprojectfinale.model.Enseignement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/enseignant")
public class EnseignantController {

	@Autowired
	private EnseignantDao dao;

	@PostMapping("")
	public void addEnseignant(@RequestBody Enseignant enseignant) {
		dao.save(enseignant);
	}


	@PutMapping({"{id}","{id}/"})
	public void updateEnseignant(@RequestBody Enseignant Enseignant, @PathVariable String code) {
		Enseignant enseignant = dao.findById(code).get();
		dao.save(enseignant);
	}

	@GetMapping({"{id}", "{id}/" })
	public Enseignant GetEnseignantById(@PathVariable String code) {
		return dao.findById(code).get();
	}

	@DeleteMapping("/delete/{code}")
	public void delEnseignant(@PathVariable String code) {
		dao.deleteById(code);
	}

	@GetMapping({"", "/"})
	public List<Enseignant> enseignants() {
		return this.dao.findAll();
	}

}
