package com.example.samu.model;

import javax.persistence.*;

@Entity
@Table(name = "rappel")
public class Rappel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rappel",nullable = false,updatable = false)
    private Long idRappel;

    private String nomStructure;
    private String servcie;
    private String specialite;
    private String typeAppel;
    private String description;
}
