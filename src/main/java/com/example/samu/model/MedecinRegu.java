package com.example.samu.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "medc_regu")
public class MedecinRegu extends User{

    private String tel;
    private String firstName;
    private String lastName;
    private String email;

    @OneToMany(cascade = CascadeType.ALL)
    List<Dossier> dossiers = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    List<HistoriqueMedRegu> historiqueMedRegus = new ArrayList<>();
}
