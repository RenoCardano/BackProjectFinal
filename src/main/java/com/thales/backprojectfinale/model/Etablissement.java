package com.thales.springboot_project.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Etablissement {

    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String code;
    @NonNull
    private String description;
    @NonNull
    private String marque;
    @NonNull
    private String modele;
    @NonNull
    private int mois;
    @NonNull
    private int annee;
    @NonNull
    private int euro_critere;

    @ManyToMany(mappedBy = "vehicules")
    private List<Piece> pieces;

}
