package com.example.samu.api;


import com.example.samu.model.DossPrimResult;
import com.example.samu.model.Dossier;
import com.example.samu.model.DossierPrimaire;
import com.example.samu.service.DossPrimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("doss/prim")
public class DossPrimController {

    public final DossPrimService dossPrimService;

    @Autowired
    public DossPrimController(DossPrimService dossPrimService) {
        this.dossPrimService = dossPrimService;
    }

    @PostMapping("/add")
    public ResponseEntity<DossierPrimaire> addDossPrim(@RequestBody DossierPrimaire doss)
    {
            DossierPrimaire doss1 = dossPrimService.addDossPrim(doss);
            return new ResponseEntity<>(doss1, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public List<Dossier> findAllDossierActifs()
    {
        return dossPrimService.findAllDossierActif();
    }
}
