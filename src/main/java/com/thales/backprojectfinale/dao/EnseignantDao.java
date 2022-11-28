package com.thales.backprojectfinale.dao;

import com.thales.backprojectfinale.model.Enseignant;
import com.thales.springboot_project.model.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnseignantDao extends JpaRepository<Enseignant, String> {
}
