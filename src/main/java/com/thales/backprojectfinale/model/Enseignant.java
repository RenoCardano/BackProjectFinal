package com.thales.backprojectfinale.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

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

    /*
    @OneToMany(mappedBy = "enseignant")
    private List<Cours> coursList = new ArrayList<>();
*/
}
