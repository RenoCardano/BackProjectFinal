package com.thales.backprojectfinale.controller;

import com.thales.backprojectfinale.dao.IEtablissementDao;
import com.thales.backprojectfinale.dao.IJourDao;
import com.thales.backprojectfinale.model.Etablissement;
import com.thales.backprojectfinale.model.Jour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/jour")
public class JourController {

	@Autowired
	private IJourDao dao;

	@PostMapping("")
	public Jour addJour(@RequestBody Jour jour) {
		return dao.save(jour);
	}

	@PutMapping({"{id}","{id}/"})
	public void updateJour(@RequestBody Jour jour, @PathVariable Integer id) {
		Jour jourFound = dao.findById(id).get();
		dao.save(jourFound);
	}

	@GetMapping({"{id}", "{id}/" })
	public Jour GetJourById(@PathVariable Integer id) {
		return dao.findById(id).get();
	}

	@DeleteMapping("/delete/{id}")
	public Boolean delJour(@PathVariable Integer id) {
		try {
			dao.deleteById(id);
			return true;
		} catch (Exception e ) {
			return false;
		}
	}

	@GetMapping({"", "/"})
	public List<Jour> jourList() {
		return this.dao.findAll();
	}

	@GetMapping({"/create"})
	public void createSamplesCategorie(){
		this.dao.save(new Jour("LUNDI"));
		this.dao.save(new Jour("MARDI"));
		this.dao.save(new Jour("MERCREDI"));
		this.dao.save(new Jour("JEUDI"));
		this.dao.save(new Jour("VENDREDI"));
		this.dao.save(new Jour("SAMEDI"));
	}

}
