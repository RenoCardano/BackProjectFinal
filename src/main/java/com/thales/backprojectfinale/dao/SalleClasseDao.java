package com.thales.backprojectfinale.dao;

import com.thales.backprojectfinale.model.SalleClasse;
import com.thales.springboot_project.model.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalleClasseDao extends JpaRepository<SalleClasse, String> {
}
