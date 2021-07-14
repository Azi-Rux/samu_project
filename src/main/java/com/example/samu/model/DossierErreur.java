package com.example.samu.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dossierErreur")
public class DossierErreur extends Dossier{
    private String categorie;
}
