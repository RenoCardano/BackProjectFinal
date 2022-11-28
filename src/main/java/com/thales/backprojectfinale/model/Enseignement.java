package com.thales.backprojectfinale.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Enseignement {

    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_enseignant", nullable = false)
    private Enseignant idEns;
    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_matiere", nullable = false)
    private Matiere idMatiere;
}
