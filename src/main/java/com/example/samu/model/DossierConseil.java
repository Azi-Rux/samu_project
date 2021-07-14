package com.example.samu.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dossierConseil")
public class DossierConseil extends Dossier{

    private String motifAppel;
    private String adresse;
    private String objetRenseignement;
}
