package com.thales.backprojectfinale.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Etablissement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEtablissement;
    @NonNull
    private String nom;
    @NonNull
    private String adresse;
    @NonNull
    private String type;
    @NonNull
    private String numeroTelephone;

    private String logo;

    /*
    @OneToMany(mappedBy = "etablissement")
    private List<Utilisateur> authentificationList = new ArrayList<>();
    */

    @OneToMany(mappedBy = "etablissement")
    private List<SalleClasse> salles = new ArrayList<>();


}
