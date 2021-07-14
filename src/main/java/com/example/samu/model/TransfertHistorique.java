package com.example.samu.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "transfert_histo")
public class TransfertHistorique {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_samu",nullable = false,updatable = false)
    private Long idTransHisto;

    private Long idSamuEmetteur;
    private Long idSamuRecepteur;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime dateTimeTransf;
}
