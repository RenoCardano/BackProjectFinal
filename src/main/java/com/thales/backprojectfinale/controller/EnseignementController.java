package com.thales.backprojectfinale.controller;

import com.thales.backprojectfinale.dao.IEnseignementDao;
import com.thales.backprojectfinale.dao.IJourDao;
import com.thales.backprojectfinale.model.Enseignant;
import com.thales.backprojectfinale.model.Enseignement;
import com.thales.backprojectfinale.model.Jour;
import com.thales.backprojectfinale.model.Matiere;
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

	@GetMapping({"/create"})
	public void createSamplesCategorie(){
		Enseignant e1 = new Enseignant();
		e1.setIdEns(1);
		Enseignant e2 = new Enseignant();
		e2.setIdEns(2);
		Enseignant e3 = new Enseignant();
		e3.setIdEns(3);
		Enseignant e4 = new Enseignant();
		e4.setIdEns(4);
		Enseignant e5 = new Enseignant();
		e5.setIdEns(5);
		Enseignant e6 = new Enseignant();
		e6.setIdEns(6);
		Enseignant e7 = new Enseignant();
		e7.setIdEns(7);
		Enseignant e8 = new Enseignant();
		e8.setIdEns(8);

		Matiere m1 = new Matiere();
		m1.setId(1);
		Matiere m2 = new Matiere();
		m2.setId(2);
		Matiere m3 = new Matiere();
		m3.setId(3);
		Matiere m4 = new Matiere();
		m4.setId(4);
		Matiere m5 = new Matiere();
		m5.setId(5);
		Matiere m6 = new Matiere();
		m6.setId(6);

		this.dao.save(new Enseignement(e1,m1));
		this.dao.save(new Enseignement(e1,m2));
		this.dao.save(new Enseignement(e1,m3));
		this.dao.save(new Enseignement(e1,m4));
		this.dao.save(new Enseignement(e1,m5));
		this.dao.save(new Enseignement(e1,m6));
		this.dao.save(new Enseignement(e2,m1));
		this.dao.save(new Enseignement(e3,m1));
		this.dao.save(new Enseignement(e4,m1));
		this.dao.save(new Enseignement(e5,m1));
		this.dao.save(new Enseignement(e6,m1));
		this.dao.save(new Enseignement(e7,m1));
		this.dao.save(new Enseignement(e8,m1));
		this.dao.save(new Enseignement(e2,m3));
		this.dao.save(new Enseignement(e4,m5));
		this.dao.save(new Enseignement(e6,m4));
	}

}
