package com.example.samu.service;

import com.example.samu.model.User;
import com.example.samu.repository.ParmRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ParmService {

    @Autowired
    public final ParmRepos parmRepos;

    public ParmService(ParmRepos parmRepos) {
        this.parmRepos = parmRepos;
    }


    public String login(String login,String mdp,Long sip)
    {
        User user = parmRepos.findAdminByLogin(login).orElse(null);
        if(user==null)
        {
            return "l'utilisateur est nulle";
        }
        else
        {
            if(user.getMdp()==mdp && user.getSip()==sip)
            {
                return "L'utisateur bien connecté";
            }
            else
            {
                return "Erreur de conexion via ce mdp et sip";
            }
        }
    }


}
