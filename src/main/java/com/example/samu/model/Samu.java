package com.example.samu.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "samu")
public class Samu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_samu",nullable = false,updatable = false)
    private Long idSamu;

    private String nameSamu;

    private Long sipSamu;



    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "samu_fid",referencedColumnName = "idSamu")
    List<User> users = new ArrayList<>();

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="ville_fid")
    private Ville ville;
}
