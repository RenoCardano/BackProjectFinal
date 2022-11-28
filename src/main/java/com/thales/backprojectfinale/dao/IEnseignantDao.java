package com.thales.backprojectfinale.dao;

import com.thales.backprojectfinale.model.Enseignant;
import com.thales.backprojectfinale.model.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEnseignantDao extends JpaRepository<Enseignant, Integer> {
}
