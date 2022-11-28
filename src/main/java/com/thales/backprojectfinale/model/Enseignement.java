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
    @OneToOne
    private Enseignant enseignant;
    @OneToOne
    private Matiere matiereEnseigner;


    @OneToMany(mappedBy = "enseignements")
    private List<Cours> coursList = new ArrayList<>();


    /*
    @ManyToMany
    @JoinTable( name="EMP_PROJ",
            joinColumns = @JoinColumn(name="idEns"),
            inverseJoinColumns = @JoinColumn(name="codeMat"))
    private List<Matiere> matièreEnseignant = new ArrayList<Matiere>();

     */

}


