package com.thales.backprojectfinale.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCours;

    @NonNull
    private String nomCour;

    @NonNull
    private String heure_debut;
    @NonNull
    private String heure_fin;

    @ManyToOne(targetEntity = Classe.class)
    private Classe classe;


    @ManyToOne(targetEntity = Cours.class)
    private Jour jour;

    @ManyToOne
    private Enseignant enseignant;

    @ManyToOne
    private Matiere matiere;

    @ManyToOne
    private SalleClasse salleClasse;

}
