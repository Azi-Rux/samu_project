package com.example.samu.controller;


import com.example.samu.model.Parm;
import com.example.samu.service.ParmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/parm")
public class ParmController {

    @Autowired
    public ParmService parmService;

//    @GetMapping
//    public List<Parm> getParms()
//    {
//        return List.of(
//                new Parm(
//                        10L,
//                        "amine",
//                        "123456",
//                        "037388399298",
//                        "amine ",
//                        "abdelhakim",
//                        "amineabdo05@gmail.com"
//                        )
//        );
//    }

    @PostMapping(path="/connecter/{login}/{mdp}/{sip}")
    public String seConnecter(@PathVariable String login,@PathVariable String mdp,@PathVariable Long sip)
    {
        return parmService.login(login,mdp,sip);
    }
}
