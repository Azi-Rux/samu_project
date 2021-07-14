package com.example.samu.model;

import lombok.Data;

import javax.persistence.*;

@MappedSuperclass
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user",nullable = false,updatable = false)
    private Long id;

    private Long sip;

    @Column(unique = true)
    private String login;

    private String mdp;
}
