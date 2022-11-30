package com.thales.backprojectfinale.dao;

import com.thales.backprojectfinale.model.Etablissement;
import com.thales.backprojectfinale.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IAuthentificationDao extends JpaRepository<Utilisateur, Integer> {

    @Query("SELECT u FROM Utilisateur u WHERE u.login = ?1 and u.motdepasse = ?2")
    Utilisateur findUserByStatusAndName(String login, String pw);
}
