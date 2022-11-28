package com.thales.backprojectfinale.controller;

import com.thales.backprojectfinale.dao.IEnseignementDao;
import com.thales.backprojectfinale.dao.IJourDao;
import com.thales.backprojectfinale.model.Enseignement;
import com.thales.backprojectfinale.model.Jour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/enseignement")
public class EnseignementController {

	@Autowired
	private IEnseignementDao dao;

	@PostMapping("")
	public Enseignement addEnseignement(@RequestBody Enseignement enseignement) {
		return dao.save(enseignement);
	}

	@PutMapping({"{id}","{id}/"})
	public void updateEnseignement(@RequestBody Enseignement Enseignement, @PathVariable Integer id) {
		Enseignement enseignement = dao.findById(id).get();
		dao.save(enseignement);
	}

	@GetMapping({"{id}", "{id}/" })
	public Enseignement GetEnseignementById(@PathVariable Integer id) {
		return dao.findById(id).get();
	}

	@DeleteMapping("/delete/{id}")
	public Boolean delEnseignement(@PathVariable Integer id) {
		try {
			dao.deleteById(id);
			return true;
		} catch (Exception e ) {
			return false;
		}
	}

	@GetMapping({"", "/"})
	public List<Enseignement> enseignements() {
		return this.dao.findAll();
	}

}
