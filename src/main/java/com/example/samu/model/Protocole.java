package com.example.samu.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "protocole")
public class Protocole {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proto",nullable = false,updatable = false)
    private Long idProto;
    private String libellQualif;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "protocole")
    private AffectationSmur affectationSmur;
}
