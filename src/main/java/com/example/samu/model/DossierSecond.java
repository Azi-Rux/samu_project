package com.example.samu.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "dossierSecond")
public class DossierSecond extends Dossier{

    private String specialite;
    private String service;
    private String structure;
    private String nameStruct;

    public DossierSecond(Long idDossier, String etatDossier, String typeDossier, String firstname, String tel, String lastname, String motifAppel, LocalDateTime dateCreation, Parm parm) {
        super(idDossier, etatDossier, typeDossier, firstname, tel, lastname, motifAppel, dateCreation, parm);
    }

    @OneToMany(cascade = CascadeType.ALL)
    List<TransfertHistorique> transfertHistoriques  = new ArrayList<>();
}
