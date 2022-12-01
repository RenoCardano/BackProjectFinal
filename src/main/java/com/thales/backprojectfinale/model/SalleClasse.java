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
public class SalleClasse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSalleClasse;

    @NonNull
    private String nom;

    @NonNull
    private int capacite;

    @OneToMany(mappedBy = "salleClasse",  cascade = CascadeType.ALL )
    @JsonIgnore
    private List<Cours> coursListSalle = new ArrayList<Cours>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private Etablissement etablissement;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Matiere matiereExcluClasse;

}
