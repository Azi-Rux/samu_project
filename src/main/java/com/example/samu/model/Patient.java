package com.example.samu.model;

import javax.persistence.*;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_patient",nullable = false,updatable = false)
    private Long idPatient;

    private String firstNamePati;
    private String lastNamePati;
    private Integer age;
    private String sexe;
    private Double poidPatient;
    private String medicament;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "doss_fid")
    private Dossier dossier ;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "patient")
    private InformClini informClini;
}
