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
public class Classe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClasse;

    @NonNull
    private String nomClasse;

    /*
    @NonNull
    @ManyToOne(cascade = CascadeType. MERGE)
    private Enseignant professeurPrincipal;
    */

    @OneToMany(mappedBy = "classe", targetEntity = Cours.class)
    @JsonIgnore
    private List<Cours> coursList = new ArrayList<>();

}
