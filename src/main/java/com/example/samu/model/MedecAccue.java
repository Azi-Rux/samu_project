package com.example.samu.model;

import javax.persistence.*;

@Entity
@Table(name = "medc_acc")
public class MedecAccue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_med_acc",nullable = false,updatable = false)
    private Long idMedAccu;

    private String firstNameMed;
    private  String lastNameMed;
    private Integer ageMed;
    private String telMed;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "medAcc")
    private Smur smur;
}
