package com.thales.backprojectfinale.dao;

import com.thales.backprojectfinale.model.Enseignement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEnseignementDao extends JpaRepository<Enseignement, Integer> {
}
