package com.example.samu.service;

import com.example.samu.model.Caller;
import com.example.samu.model.DossPrimResult;
import com.example.samu.model.Dossier;
import com.example.samu.model.DossierPrimaire;
import com.example.samu.repository.CallerRepo;
import com.example.samu.repository.DossPrimRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class DossPrimService {

    public final DossPrimRepo dossPrimRepo;
    public final CallerService callerService;

    @Autowired
    public DossPrimService(DossPrimRepo dossPrimRepo, CallerService callerService) {
        this.dossPrimRepo = dossPrimRepo;
        this.callerService = callerService;
    }

    //Add new primary folder to the database

    public DossierPrimaire addDossPrim(DossierPrimaire doss)
    {
        if (doss == null) return null;
        //else if (dossPrimRepo.existsById(doss.getIdDossier())) return null;
        //agent.getIdentity().setIdType(IdType.CIN);
        //agent.getIdentity().setSerialNumber("eee");

        if(doss.getCategorie().equals("GP"))
        {
            doss.setVille(null);
            doss.setFunction(null);
            doss.setNumEquipePC(null);
            doss.setDateCreation(LocalDateTime.now());
            doss.setEtatDossier("En cours");

            Caller caller = new Caller();
            caller.setFirstNameCaller(doss.getFirstname());
            caller.setLastName(doss.getLastname());
            caller.setCinCaller(doss.getCin());
            caller.setTel(doss.getTel());
            caller.setDateCall(LocalDateTime.now());
            callerService.addCaller(caller);
            doss.setCaller(caller);
        }
        else if(doss.getCategorie().equals("PC"))
        {
            doss.setFirstname(null);
            doss.setLastname(null);
            doss.setCin(null);
            doss.setFunction(null);
            doss.setDateCreation(LocalDateTime.now());
            doss.setEtatDossier("En cours");

            Caller caller = new Caller();
            caller.setFirstNameCaller(null);
            caller.setLastName(null);
            caller.setCinCaller(null);
            caller.setTel(doss.getTel());
            caller.setDateCall(LocalDateTime.now());
            callerService.addCaller(caller);
            doss.setCaller(caller);
        }

        else if(doss.getCategorie().equals("AL"))
        {
            doss.setDateCreation(LocalDateTime.now());
            doss.setEtatDossier("En cours ");
            doss.setCin(null);
            doss.setNumEquipePC(null);

            Caller caller = new Caller();
            caller.setFirstNameCaller(doss.getFirstname());
            caller.setLastName(doss.getLastname());
            caller.setCinCaller(null);
            caller.setTel(doss.getTel());
            caller.setDateCall(LocalDateTime.now());
            callerService.addCaller(caller);
            doss.setCaller(caller);
        }

        return dossPrimRepo.save(doss);
    }

    public List<Dossier> findAllDossierActif()
    {
        return dossPrimRepo.findAllDossiers();
    }
}
