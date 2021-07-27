package com.example.samu.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Dossier{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_dossier",nullable = false,updatable = false)
    private Long idDossier;

    @Column(name = "id_resp_samu" )
    private Long idRespSamu;

    @Column(name = "etat_dossier")
    private String etatDossier;
    private Integer annee;

    @Column(name = "latitude_smur",nullable = false)
    private Double latitudeSmur;

    @Column(name = "longitude_smur",nullable = false)
    private Double longitudeSmur;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @Column(name = "date_creation",updatable = false)
    private LocalDateTime dateCreation;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "dossier")
    private Patient patient;

//    @OneToOne(mappedBy = "dossier1")
//    private HistoriqueMedRegu historiqueMedRegu;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "caller_fid")
    private Caller caller ;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "dossier_fid",referencedColumnName = "id_dossier")
    List<Rappel> rappels = new ArrayList<>();


}
