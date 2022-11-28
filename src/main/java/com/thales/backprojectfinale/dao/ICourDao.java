package com.thales.backprojectfinale.dao;

import com.thales.backprojectfinale.model.Cours;
import com.thales.backprojectfinale.model.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourDao extends JpaRepository<Cours, Integer> {
}
