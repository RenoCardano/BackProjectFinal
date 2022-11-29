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
public class Enseignant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEns;

    @NonNull
    private String nom;

    @NonNull
    private LocalDate dateDeNaissance;

    @OneToOne(mappedBy = "enseignant", cascade = CascadeType. MERGE)
    @JsonIgnore
    private Enseignement enseignement;


    /*
    @OneToMany(mappedBy = "enseignant")
    private List<Cours> coursList = new ArrayList<>();


    @ManyToMany
    @JoinTable( name="EMP_PROJ",
            joinColumns = @JoinColumn(name="idEns"),
            inverseJoinColumns = @JoinColumn(name="codeMat"))
    private List<Matiere> matièreEnseignant = new ArrayList<Matiere>();
 */
}


