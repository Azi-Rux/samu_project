package com.example.samu.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Ville {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user",nullable = false,updatable = false)
    private Long idVille;

    @Column(name = "name_ville",nullable = false,updatable = false)
    private String nameVille;



    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "ville")
    private Samu samu;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ville_fid",referencedColumnName = "idVille")
    List<Hopital> hopitals = new ArrayList<>();
}
