package com.thales.backprojectfinale.dao;

import com.thales.backprojectfinale.model.Matiere;
import com.thales.springboot_project.model.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatiereDao extends JpaRepository<Matiere, String> {
}
