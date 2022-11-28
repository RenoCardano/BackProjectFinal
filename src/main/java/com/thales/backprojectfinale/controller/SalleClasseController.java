package com.thales.backprojectfinale.controller;

import com.thales.backprojectfinale.dao.SalleClasseDao;
import com.thales.backprojectfinale.model.SalleClasse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/salleclasse")
public class SalleClasseController {

	@Autowired
	private SalleClasseDao dao;

	@PostMapping("")
	public void addSalleClasse(@RequestBody SalleClasse salleClasse) {
		dao.save(salleClasse);
	}


	@PutMapping({"{id}","{id}/"})
	public void updateSalleClasse(@RequestBody SalleClasse SalleClasse, @PathVariable String code) {
		SalleClasse salleClasse = dao.findById(code).get();
		dao.save(salleClasse);
	}

	@GetMapping({"{id}", "{id}/" })
	public SalleClasse GetSalleClasseById(@PathVariable String code) {
		return dao.findById(code).get();
	}

	@DeleteMapping("/delete/{code}")
	public void delSalleClasse(@PathVariable String code) {
		dao.deleteById(code);
	}

	@GetMapping({"", "/"})
	public List<SalleClasse> salleClasses() {
		return this.dao.findAll();
	}

}
