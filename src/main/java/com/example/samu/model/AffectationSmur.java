package com.example.samu.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "affectationSmur")
@Data
public class AffectationSmur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_affec",nullable = false,updatable = false)
    private Long idAffect;

    private Long idDossier;
    private Double latitudeSmur;
    private Double longitudeSmur;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime dateProtocole;

    private String etat;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="proto_fid")
    private Protocole protocole;
}
