package com.example.samu.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
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
