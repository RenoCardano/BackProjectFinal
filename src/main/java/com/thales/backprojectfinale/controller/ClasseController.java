package com.thales.backprojectfinale.controller;

import com.thales.backprojectfinale.dao.IClasseDao;
import com.thales.backprojectfinale.dao.IEtablissementDao;
import com.thales.backprojectfinale.model.Classe;
import com.thales.backprojectfinale.model.Enseignant;
import com.thales.backprojectfinale.model.Etablissement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping("/classe")
public class ClasseController {

	@Autowired
	private IClasseDao dao;

	@PostMapping("")
	public Classe addClasse(@RequestBody Classe etablissement) {
		return dao.save(etablissement);
	}

	@PutMapping({"{id}","{id}/"})
	public void updateClasse(@RequestBody Classe classe, @PathVariable Integer id) {
		Classe classeFound = dao.findById(id).get();
		dao.save(classeFound);
	}

	@GetMapping({"{id}", "{id}/" })
	public Classe GetClasseById(@PathVariable Integer id) {
		return dao.findById(id).get();
	}

	@DeleteMapping("/delete/{id}")
	public Boolean delClasse(@PathVariable Integer id) {
		try {
			dao.deleteById(id);
			return true;
		} catch (Exception e ) {
			return false;
		}
	}

	@GetMapping({"", "/"})
	public List<Classe> classeList() {
		return this.dao.findAll();
	}

	@GetMapping({"/create"})
	public void createSamplesClasse(){
		this.dao.save(new Classe("6eA"));
		this.dao.save(new Classe("2nd1"));
		this.dao.save(new Classe("6eB"));
		this.dao.save(new Classe("6eC"));
	}

}
