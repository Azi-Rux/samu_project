package com.example.samu.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@MappedSuperclass
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Dossier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dossier",nullable = false,updatable = false)
    private Long idDossier;

    @Column(name = "id_resp_samu" )
    private Long idRespSamu;

    @Column(name = "date_creation")
    private String etatDossier;
    private Integer annee;

    @Column(nullable = false)
    private Double latitudeSmur;

    @Column(nullable = false)
    private Double longitudeSmur;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @Column(name = "date_creation")
    private LocalDateTime dateCreation;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "dossier")
    private Patient patient;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "dossier")
    private HistoriqueMedRegu historiqueMedRegu;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "caller_fid")
    private Caller caller ;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "dossier_fid",referencedColumnName = "idDossier")
    List<Rappel> rappels = new ArrayList<>();
}
