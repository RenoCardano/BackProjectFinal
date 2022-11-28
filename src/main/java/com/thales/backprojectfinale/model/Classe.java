package com.thales.backprojectfinale.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

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
    private String proffeseurPrincipal;

    @OneToMany(mappedBy = "classe")
    private List<Cours> coursList = new ArrayList<>();

}
