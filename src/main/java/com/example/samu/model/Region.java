package com.example.samu.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "region")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_region",nullable = false,updatable = false)
    private Long idRegion;
    private String nameRegion;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "region_fid",referencedColumnName = "id_region")
    List<Ville> villes = new ArrayList<>();
}
