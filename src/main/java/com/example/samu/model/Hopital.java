package com.example.samu.model;

import javax.persistence.*;

@Entity
@Table(name = "hopital")
public class Hopital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hopital",nullable = false,updatable = false)
    private Long idHopital;

    private String nameHopital;
    private Double latitudeHop;
    private Double longitudeHop;
    private String adresseHop;
}
