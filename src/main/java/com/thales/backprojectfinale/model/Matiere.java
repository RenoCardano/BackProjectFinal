package com.thales.backprojectfinale.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Matiere {

    @Id
    private String codeMat;

    @NonNull
    private String couleur;

    @NonNull
    private String nom;
}
