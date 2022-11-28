package com.thales.backprojectfinale.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor

public class Jour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idJour;

    @NonNull
    @Enumerated(EnumType.STRING)
    private JoursSemaine jour;

    @OneToMany(mappedBy = "jourCours", targetEntity = Cours.class)
    private List<Cours> coursJourList = new ArrayList<Cours>();

}
