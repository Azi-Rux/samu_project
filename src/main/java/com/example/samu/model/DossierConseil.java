package com.example.samu.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "dossierConseil")
@Data
public class DossierConseil extends Dossier{

    private String adresse;
    private String objetRenseignement;

    public DossierConseil(Long idDossier, String etatDossier, String typeDossier, String firstname, String tel, String lastname, String motifAppel, LocalDateTime dateCreation, Parm parm) {
        super(idDossier, etatDossier, typeDossier, firstname, tel, lastname, motifAppel, dateCreation, parm);
    }
}
