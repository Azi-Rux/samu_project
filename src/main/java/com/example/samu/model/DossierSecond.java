package com.example.samu.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "dossierSecond")
public class DossierSecond extends Dossier{
    private String specialite;
    private String service;
    private String structure;
    private String nameStruct;
    private String motiAppel;

    @OneToMany(cascade = CascadeType.ALL)
    List<TransfertHistorique> transfertHistoriques  = new ArrayList<>();
}
