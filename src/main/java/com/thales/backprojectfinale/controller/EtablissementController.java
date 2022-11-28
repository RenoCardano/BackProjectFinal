package com.thales.springboot_project.controller;

import com.thales.springboot_project.dao.IEtablissementDao;
import com.thales.springboot_project.model.Etablissement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/vehicule")
public class EtablissementController {

	@Autowired
	private IEtablissementDao dao;

	@PostMapping("")
	public void addPiece(@RequestBody Etablissement etablissement) {
		dao.save(etablissement);
	}


	@PutMapping({"{id}","{id}/"})
	public void updateEtablissement(@RequestBody Etablissement Etablissement, @PathVariable String code) {
		Etablissement etablissement = dao.findById(code).get();
		dao.save(etablissement);
	}

	@GetMapping({"{id}", "{id}/" })
	public Etablissement GetEtablissementById(@PathVariable String code) {
		return dao.findById(code).get();
	}

	@DeleteMapping("/delete/{code}")
	public void delEtablissment(@PathVariable String code) {
		dao.deleteById(code);
	}

	@GetMapping({"", "/"})
	public List<Etablissement> etablissement() {
		return this.dao.findAll();
	}

}
