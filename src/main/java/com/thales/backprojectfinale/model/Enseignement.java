package com.thales.backprojectfinale.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@RequiredArgsConstructor
public class Enseignement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEnseignement;
    @NonNull
    @ManyToOne(cascade = CascadeType. MERGE)
    private Enseignant enseignant;
    @NonNull
    @ManyToOne(cascade = CascadeType. MERGE)
    private Matiere matiereEnseignee;


    @OneToMany(mappedBy = "enseignement")
    @JsonIgnore
    private List<Cours> coursList = new ArrayList<>();

}


