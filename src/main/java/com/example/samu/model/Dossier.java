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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDossier;

    @Column(name = "id_resp_samu" )
    private Long idRespSamu;

    @Column(name = "etat_dossier")
    private String etatDossier;

    @Column(name = "type_doss")
    private String typeDossier;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "tel")
    private String tel;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "motif_appel")
    private String motifAppel;

    @Column(name = "annee")
    private Integer annee;

    @Column(name = "latitude_smur")
    private Double latitudeSmur;

    @Column(name = "longitude_smur")
    private Double longitudeSmur;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @Column(name = "date_creation",updatable = false)
    private LocalDateTime dateCreation;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "dossier")
    private Patient patient;

    @OneToOne(mappedBy = "dossier1")
    private HistoriqueMedRegu historiqueMedRegu;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "caller_fid")
    private Caller caller ;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "parm_fid")
    private Parm parm ;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "dossier_fid",referencedColumnName = "idDossier")
    List<Rappel> rappels = new ArrayList<>();

    public Dossier(Long idDossier, String etatDossier, String typeDossier, String firstname, String tel, String lastname, String motifAppel, LocalDateTime dateCreation, Parm parm) {
        this.idDossier = idDossier;
        this.etatDossier = etatDossier;
        this.typeDossier = typeDossier;
        this.firstname = firstname;
        this.tel = tel;
        this.lastname = lastname;
        this.motifAppel = motifAppel;
        this.dateCreation = dateCreation;
        this.parm = parm;
    }
}
