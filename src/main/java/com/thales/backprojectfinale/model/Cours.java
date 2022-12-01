package com.thales.backprojectfinale.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @NonNull
    @ManyToOne(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    private Classe classe;

    @NonNull
    @ManyToOne(cascade = CascadeType. MERGE)
    private Enseignement enseignement;
    @NonNull

    @ManyToOne(cascade = CascadeType. MERGE)
    private SalleClasse salleClasse;
    @NonNull

    @ManyToOne(cascade = CascadeType. MERGE)
    private Jour jourCours;

}
