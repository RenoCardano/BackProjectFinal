package com.thales.backprojectfinale.dao;

import com.thales.backprojectfinale.model.Etablissement;
import com.thales.backprojectfinale.model.Jour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IJourDao extends JpaRepository<Jour, Integer> {
}
