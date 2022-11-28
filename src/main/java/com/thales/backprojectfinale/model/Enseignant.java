package com.thales.backprojectfinale.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Enseignant {

    @Id
    private String idEns;

    @NonNull
    private String nom;

    @NonNull
    private LocalDate dateDeNaissance;

}
