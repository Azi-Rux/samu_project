package com.example.samu.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
public class ResponSamu extends User{

    private String tel;
    private String firstName;
    private String lastName;
    private String email;
}
