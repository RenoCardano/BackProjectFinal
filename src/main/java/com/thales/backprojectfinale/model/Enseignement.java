package com.thales.backprojectfinale.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Enseignement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEnseignement;
    @NonNull
    @OneToOne(cascade = CascadeType. MERGE)
    private Enseignant enseignant;
    @NonNull
    @OneToOne(cascade = CascadeType. MERGE)
    private Matiere matiereEnseignee;


    @OneToMany(mappedBy = "enseignement")
    private List<Cours> coursList = new ArrayList<>();

}


