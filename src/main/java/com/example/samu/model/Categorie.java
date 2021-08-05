package com.example.samu.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categorie")
@Data
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categ",nullable = false,updatable = false)
    private Long idCategorie;
    private String nomCategorie;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "catego_fid",referencedColumnName = "id_categ")
    List<Hopital> hopitals = new ArrayList<>();
}
