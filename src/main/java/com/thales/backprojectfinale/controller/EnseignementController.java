package com.thales.backprojectfinale.controller;

import com.thales.backprojectfinale.dao.EnseignementDao;
import com.thales.backprojectfinale.dao.MatiereDao;
import com.thales.backprojectfinale.model.Enseignement;
import com.thales.backprojectfinale.model.Matiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/enseignement")
public class EnseignementController {

	@Autowired
	private EnseignementDao dao;

	@PostMapping("")
	public void addEnseignement(@RequestBody Enseignement enseignement) {
		dao.save(enseignement);
	}


	@PutMapping({"{id}","{id}/"})
	public void updateEnseignement(@RequestBody Enseignement Enseignement, @PathVariable String code) {
		Enseignement enseignement = dao.findById(code).get();
		dao.save(enseignement);
	}

	@GetMapping({"{id}", "{id}/" })
	public Enseignement GetEnseignementById(@PathVariable String code) {
		return dao.findById(code).get();
	}

	@DeleteMapping("/delete/{code}")
	public void delEnseignement(@PathVariable String code) {
		dao.deleteById(code);
	}

	@GetMapping({"", "/"})
	public List<Enseignement> enseignements() {
		return this.dao.findAll();
	}

}
