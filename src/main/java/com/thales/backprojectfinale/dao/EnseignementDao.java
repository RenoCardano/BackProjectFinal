package com.thales.backprojectfinale.dao;

import com.thales.backprojectfinale.model.Enseignement;
import com.thales.springboot_project.model.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnseignementDao extends JpaRepository<Enseignement, String> {
}
