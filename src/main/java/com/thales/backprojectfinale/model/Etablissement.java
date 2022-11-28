package com.thales.backprojectfinale.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

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
    private int numeroTelephone;
    @NonNull
    private String logo;

    /*
    @OneToMany(mappedBy = "etablissement")
    private List<Utilisateur> authentificationList = new ArrayList<>();
    */
}
