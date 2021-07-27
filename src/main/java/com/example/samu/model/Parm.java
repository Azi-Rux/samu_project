package com.example.samu.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Parm extends User{

    private String tel;
    private String firstName;
    private String lastName;
    private String email;


    @OneToMany(cascade = CascadeType.ALL)
    List<Dossier> dossiers = new ArrayList<>();

}
