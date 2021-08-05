package com.example.samu.service;

import com.example.samu.model.Parm;
import com.example.samu.model.User;
import com.example.samu.repository.ParmRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ParmService {


    public final ParmRepos parmRepos;

    @Autowired
    public ParmService(ParmRepos parmRepos) {
        this.parmRepos = parmRepos;
    }


    public String login(String login,String mdp,int sip)
    {
        Parm parm = parmRepos.findParmByLogin(login).orElse(null);
        if(parm==null)
        {
            return "l'utilisateur est nulle";
        }
        else
        {
            if(parm.getMdp().equals(mdp) && parm.getSip()==sip)
            {
                return "L'utisateur bien connecté";
            }
            else
            {
                return "Erreur de conexion via ce mdp et sip ...";
            }
        }
    }


}
