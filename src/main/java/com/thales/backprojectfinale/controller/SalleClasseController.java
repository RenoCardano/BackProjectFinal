package com.thales.backprojectfinale.controller;

import com.thales.backprojectfinale.dao.SalleClasseDao;
import com.thales.backprojectfinale.model.Jour;
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
	public SalleClasse addSalleClasse(@RequestBody SalleClasse salleClasse) {
		return dao.save(salleClasse);
	}


	@PutMapping({"{id}","{id}/"})
	public void updateSalleClasse(@RequestBody SalleClasse SalleClasse, @PathVariable Integer code) {
		SalleClasse salleClasse = dao.findById(code).get();
		dao.save(salleClasse);
	}

	@GetMapping({"{id}", "{id}/" })
	public SalleClasse GetSalleClasseById(@PathVariable Integer code) {
		return dao.findById(code).get();
	}

	@DeleteMapping("/delete/{code}")
	public void delSalleClasse(@PathVariable Integer code) {
		dao.deleteById(code);
	}

	@GetMapping({"", "/"})
	public List<SalleClasse> salleClasses() {
		return this.dao.findAll();
	}

	@GetMapping({"/create"})
	public void createSamplesSalleClasse(){
		this.dao.save(new SalleClasse("100",25));
		this.dao.save(new SalleClasse("101",30));
		this.dao.save(new SalleClasse("102",35));
		this.dao.save(new SalleClasse("200",20));
		this.dao.save(new SalleClasse("201",28));
		this.dao.save(new SalleClasse("202",32));
	}

}
