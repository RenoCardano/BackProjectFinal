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

public class Jour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idJour;

    @Enumerated(EnumType.STRING)
    private JoursSemaine jour;

    /*
    @OneToMany(mappedBy = "jour")
    private List<Cours> coursJourList = new ArrayList<Cours>();
    */
}
