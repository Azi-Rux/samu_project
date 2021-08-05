package com.example.samu.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private int sip;

    @Column(unique = true)
    private String login;

    private String mdp;

    public User(){}

    public User(Long id, int sip, String login, String mdp) {
        this.id = id;
        this.sip = sip;
        this.login = login;
        this.mdp = mdp;
    }
}
