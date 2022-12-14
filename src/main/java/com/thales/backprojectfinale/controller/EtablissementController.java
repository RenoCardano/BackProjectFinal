package com.thales.backprojectfinale.controller;

import com.thales.backprojectfinale.dao.IEtablissementDao;
import com.thales.backprojectfinale.model.Etablissement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/etablissement")
public class EtablissementController {

	@Autowired
	private IEtablissementDao dao;

	@PostMapping("")
	public Etablissement addEtablissement(@RequestBody Etablissement etablissement) {
		return dao.save(etablissement);
	}


	@PutMapping({"{id}","{id}/"})
	public void updateEtablissement(@RequestBody Etablissement Etablissement, @PathVariable Integer id) {
		Etablissement etablissement = dao.findById(id).get();
		dao.save(etablissement);
	}

	@GetMapping({"{id}", "{id}/" })
	public Etablissement GetEtablissementById(@PathVariable Integer id) {
		return dao.findById(id).get();
	}

	@DeleteMapping("/delete/{id}")
	public Boolean delEtablissment(@PathVariable Integer id) {
		try {
			dao.deleteById(id);
			return true;
		} catch (Exception e ) {
			return false;
		}
	}

	@GetMapping({"", "/"})
	public List<Etablissement> etablissement() {
		return this.dao.findAll();
	}

}
