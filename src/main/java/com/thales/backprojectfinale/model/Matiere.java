package com.thales.backprojectfinale.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @OneToMany(mappedBy = "matiereEnseignee", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Enseignement> enseignement = new ArrayList<>();


    @OneToMany(mappedBy = "matiereExcluClasse",  cascade = CascadeType.ALL)
    @JsonIgnore
    private List<SalleClasse> sallesExclues = new ArrayList<>();
    
}

