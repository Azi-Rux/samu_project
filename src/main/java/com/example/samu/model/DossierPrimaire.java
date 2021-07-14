package com.example.samu.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dossierPrimaire")
public class DossierPrimaire extends Dossier{

    private String categorie;
    private String adresseIncide;
    private String motifAppel;
    private String function;
    private String numEquipePC;
    private String catUrgence;
    private Integer nbrUrgVital;
    private Integer nbrUrgRelatif;
}
