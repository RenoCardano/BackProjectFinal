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
public class Matiere {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    private String codeMat;

    @NonNull
    private String couleur;

    @NonNull
    private String nom;

/*
    @ManyToMany(mappedBy = "matièreEnseignant")
    private List<Enseignant> enseignantMatières = new ArrayList<>();
    */

    @OneToOne(mappedBy = "matiereEnseigner")
    private Enseignement enseignement;


    @OneToMany(mappedBy = "matiereExcluClasse")
    private List<SalleClasse> sallesExclues = new ArrayList<>();


}

