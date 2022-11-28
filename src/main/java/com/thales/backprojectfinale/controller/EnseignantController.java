package com.thales.backprojectfinale.controller;

import com.thales.backprojectfinale.dao.IEnseignantDao;
import com.thales.backprojectfinale.dao.IEtablissementDao;
import com.thales.backprojectfinale.model.Enseignant;
import com.thales.backprojectfinale.model.Etablissement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

}
