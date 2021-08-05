package com.example.samu.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "dossierPrimaire")
@Data
public class DossierPrimaire extends Dossier{

    private String categorie;
    private String adresseIncide;
    private String cin;
    private String function;
    private String numEquipePC;
    private String catUrgence;
    private Integer nbrUrgVital;
    private Integer nbrUrgRelatif;
    private String ville;

    public DossierPrimaire(Long idDossier, String etatDossier, String typeDossier, String firstname, String tel, String lastname, String motifAppel, LocalDateTime dateCreation, Parm parm) {
        super(idDossier, etatDossier, typeDossier, firstname, tel, lastname, motifAppel, dateCreation, parm);
    }

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "smur_fid")
    private Smur smur ;
}
