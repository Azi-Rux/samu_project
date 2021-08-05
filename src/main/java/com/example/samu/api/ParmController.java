package com.example.samu.api;


import com.example.samu.service.ParmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "parm")
public class ParmController {

    public final  ParmService parmService;

    @Autowired
    public ParmController(ParmService parmService) {
        this.parmService = parmService;
    }


    // Action that allow us to login to the platform
    @GetMapping(path="/connecter/{login}/{mdp}/{sip}")
    public String seConnecter(@PathVariable("login") String login,@PathVariable("mdp") String mdp,@PathVariable("sip") int sip)
    {
         return parmService.login(login,mdp,sip);
    }



}
