package com.example.samu.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Smur extends User{

    private String mission;
    private String departement;
    private String nomBase;
    private String localisation;
    private Long numAmbulance;
    private String type;
    private String flotTeleph;
    private String typeEquipe;
    private String nomAmbulan;
    private String prenoAmbulan;
    private String telAmbulan;


    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "smur")
    private CoordonnSmur coordonnSmur;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "medAcc_id")
    private MedecAccue medAcc;

    @OneToMany(cascade = CascadeType.ALL)
    List<AffectationSmur> affectationSmurs = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    List<Dossier> dossiers = new ArrayList<>();

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "smur")
    private DossierPrimaire dossier_prim;
}
