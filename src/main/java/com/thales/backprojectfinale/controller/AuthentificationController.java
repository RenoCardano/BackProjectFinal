package com.thales.backprojectfinale.controller;

import com.thales.backprojectfinale.dao.IAuthentificationDao;

import com.thales.backprojectfinale.model.Utilisateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class AuthentificationController {

	@Autowired
	private IAuthentificationDao dao;

	@PostMapping("")
	public Utilisateur addUser(@RequestBody Utilisateur user) {
		return dao.save(user);
	}

	@PutMapping({"{id}","{id}/"})
	public Utilisateur updateUser(@RequestBody Utilisateur user, @PathVariable Integer id) {
		Utilisateur userFound = dao.findById(id).get();
		return dao.save(userFound);
	}

	@GetMapping({"{id}", "{id}/" })
	public Utilisateur GetUtilsateurById(@PathVariable Integer id) {
		return dao.findById(id).get();
	}

	@DeleteMapping("/delete/{id}")
	public Boolean delUtilisateur(@PathVariable Integer id) {
		try {
			dao.deleteById(id);
			return true;
		} catch (Exception e ) {
			return false;
		}
	}

	@GetMapping({""})
	public List<Utilisateur> getAllUtilisateur() {
		return this.dao.findAll();
	}



	@GetMapping("/{login}/{motdepasse}")
	public Utilisateur  findUserByStatusAndName(@PathVariable String login, @PathVariable String motdepasse) {
		System.out.println(login);
		System.out.println(motdepasse);
		return dao.findUserByStatusAndName(login, motdepasse);
	}

}
