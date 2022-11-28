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
public class SalleClasse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSalleClasse;

    @NonNull
    private String nom;

    @NonNull
    private int capacite;

    @OneToMany(mappedBy="codeMat")
    private List<Matiere> matiereExclues;

    @OneToMany(mappedBy = "salleClasse" )
    private List<Cours> coursListSalle = new ArrayList<Cours>();

    @ManyToOne(cascade = CascadeType. MERGE)
    private Etablissement etablissement;

    @ManyToOne(cascade = CascadeType. MERGE)
    private Matiere matiereExcluClasse;


}
