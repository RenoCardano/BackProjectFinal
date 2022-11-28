package com.thales.backprojectfinale.dao;

import com.thales.backprojectfinale.model.Etablissement;
import com.thales.backprojectfinale.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthentificationDao extends JpaRepository<Utilisateur, Integer> {
}
