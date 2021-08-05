package com.example.samu.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "coordSmur")
@Data
public class CoordonnSmur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCoordSmur;

    @Column(nullable = false)
    private Double latitudeSmur;

    @Column(nullable = false)
    private Double longitudeSmur;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @Column(nullable = false)
    private LocalDateTime dateTimeSmur;

    @Column(nullable = false)
    private Boolean dispo;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "smur_id")
    private Smur smur;

    public CoordonnSmur(){}

    public CoordonnSmur(Double latitudeSmur, Double longitudeSmur, LocalDateTime dateTimeSmur, Boolean dispo) {
        this.latitudeSmur = latitudeSmur;
        this.longitudeSmur = longitudeSmur;
        this.dateTimeSmur = dateTimeSmur;
        this.dispo = dispo;
    }
    public Long getIdCoordSmur() {
        return idCoordSmur;
    }

    public void setIdCoordSmur(Long idCoordSmur) {
        this.idCoordSmur = idCoordSmur;
    }

    public Double getLatitudeSmur() {
        return latitudeSmur;
    }

    public void setLatitudeSmur(Double latitudeSmur) {
        this.latitudeSmur = latitudeSmur;
    }

    public Double getLongitudeSmur() {
        return longitudeSmur;
    }

    public void setLongitudeSmur(Double longitudeSmur) {
        this.longitudeSmur = longitudeSmur;
    }

    public LocalDateTime getDateTimeSmur() {
        return dateTimeSmur;
    }

    public void setDateTimeSmur(LocalDateTime dateTimeSmur) {
        this.dateTimeSmur = dateTimeSmur;
    }

    public Boolean getDispo() {
        return dispo;
    }

    public void setDispo(Boolean dispo) {
        this.dispo = dispo;
    }

    public Smur getSmur() {
        return smur;
    }

    public void setSmur(Smur smur) {
        this.smur = smur;
    }


}
