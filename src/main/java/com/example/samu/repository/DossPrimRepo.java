package com.example.samu.repository;

import com.example.samu.model.DossPrimResult;
import com.example.samu.model.Dossier;
import com.example.samu.model.DossierPrimaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DossPrimRepo extends JpaRepository<DossierPrimaire, Long> {

    //@Query("SELECT NEW com.example.samu.model.DossPrimResult(dp.idDossier,dp.etatDossier) FROM DossierPrimaire AS dp")
    @Query(value = "SELECT NEW com.example.samu.model.Dossier(d.idDossier,d.etatDossier,d.typeDossier,d.firstname,d.tel,d.lastname,d.motifAppel,d.dateCreation,d.parm) FROM ( " +
            "    SELECT dp.parm , dp.idDossier,dp.dateCreation,dp.motifAppel,dp.firstname,dp.lastname,dp.tel,dp.etatDossier FROM DossierPrimaire AS dp WHERE etatDossier='En cours ' " +
            "    UNION " +
            "    SELECT ds.parm ,ds.idDossier,ds.dateCreation,ds.motifAppel,ds.firstname,ds.lastname,ds.tel,ds.etatDossier FROM DossierSecond AS ds WHERE etatDossier='En cours ' " +
            "    UNION " +
            "    SELECT dc.parm ,dc.idDossier,dc.dateCreation,dc.motifAppel,dc.firstname,dc.lastname,dc.tel,dc.etatDossier FROM DossierConseil AS dc WHERE etatDossier='En cours ' " +
            " ) AS dossiers AS d ORDER BY dateCreation LIMIT 3", nativeQuery = true)
    List<Dossier> findAllDossiers();
}
