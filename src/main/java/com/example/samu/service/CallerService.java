package com.example.samu.service;

import com.example.samu.model.Caller;
import com.example.samu.repository.CallerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CallerService {

    public final CallerRepo callerRepo;

    @Autowired
    public CallerService(CallerRepo callerRepo) {
        this.callerRepo = callerRepo;
    }

    public Caller addCaller(Caller caller)
    {
        if(caller == null) return null;
        //else if(callerRepo.existsById(caller.getIdCaller())) return null;

        return callerRepo.save(caller);
    }
}
