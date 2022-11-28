package com.thales.backprojectfinale.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class SalleClasse {

    @Id
    private String nom;

    @NonNull
    private int capacite;

    @OneToMany(mappedBy="codeMat")
    private List<Matiere> matiereExclues;

}
