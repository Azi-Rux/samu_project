package com.example.samu.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "region")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rappel",nullable = false,updatable = false)
    private Long idRegion;
    private String nameRegion;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "region_fid",referencedColumnName = "idRegion")
    List<Ville> villes = new ArrayList<>();
}
