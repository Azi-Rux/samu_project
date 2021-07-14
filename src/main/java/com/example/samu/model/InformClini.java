package com.example.samu.model;

import javax.persistence.*;

@Entity
@Table(name = "inform_clini")
public class InformClini {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_info_clini",nullable = false,updatable = false)
    private Long idInfoClini;

    private String hdm;
    private String neurologique;
    private String hemodynamique;
    private String respiratoir;
    private String autres;
    private String situation;
    private Integer gcs;
    private Integer tas;
    private Integer tad;
    private String resultExam;
    private String diagnostic;
    private String traitementEtrepris;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_fid")
    private Patient patient ;

}
