package com.example.samu.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "ville")
public class Ville {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ville",nullable = false,updatable = false)
    private Long idVille;

    @Column(name = "name_ville",nullable = false,updatable = false)
    private String nameVille;



    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "ville")
    private Samu samu;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ville_fid",referencedColumnName = "id_ville")
    List<Hopital> hopitals = new ArrayList<>();
}
