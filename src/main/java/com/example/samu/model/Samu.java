package com.example.samu.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "samu")
public class Samu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_samu",nullable = false,updatable = false)
    private Long idSamu;

    private String nameSamu;

    private int sipSamu;



    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "samu_fid",referencedColumnName = "id_samu")
    List<User> users = new ArrayList<>();

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="ville_fid")
    private Ville ville;
}
