package com.thales.backprojectfinale.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Cours {

    @Id
    //exemple SVT, MATH
    //a voir code ou Id inrementer ?
    private String cour;

    @NonNull
    private String heure_debut;
    @NonNull
    private String heure_fin;

    @ManyToOne
    private Classe classe;

    @ManyToOne
    private Jour jour;

}
