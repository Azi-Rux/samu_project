package com.example.samu.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "dossierErreur")
public class DossierErreur extends Dossier{
    private String categorie;

    public DossierErreur(Long idDossier, String etatDossier, String typeDossier, String firstname, String tel, String lastname, String motifAppel, LocalDateTime dateCreation, Parm parm) {
        super(idDossier, etatDossier, typeDossier, firstname, tel, lastname, motifAppel, dateCreation, parm);
    }
}
