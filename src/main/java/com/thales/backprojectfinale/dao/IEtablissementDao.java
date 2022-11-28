package com.thales.springboot_project.dao;

import com.thales.springboot_project.model.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEtablissementDao extends JpaRepository<Etablissement, String> {
}
