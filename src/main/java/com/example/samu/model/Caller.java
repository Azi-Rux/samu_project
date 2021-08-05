package com.example.samu.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "caller")
@Data
public class Caller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_caller",nullable = false,updatable = false)
    private Long idCaller;
    private String firstNameCaller;
    private String lastName;
    private String cinCaller;
    private String tel;
    private LocalDateTime dateCall;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "caller")
    private Dossier dossier;
}
