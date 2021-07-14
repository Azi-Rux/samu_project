package com.example.samu.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "resp_samu")
public class ResponSamu extends User{

    private String tel;
    private String firstName;
    private String lastName;
    private String email;
}
