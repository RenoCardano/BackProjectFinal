package com.thales.backprojectfinale.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@RequiredArgsConstructor
public class Jour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idJour;

    @NonNull
    private String jour;

    @OneToMany(mappedBy = "jourCours", targetEntity = Cours.class)
    @JsonIgnore
    private List<Cours> coursJourList = new ArrayList<Cours>();

}
