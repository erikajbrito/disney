package com.erika.disney.services;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import com.erika.disney.models.personaje_m;
import com.erika.disney.repositories.personaje_r;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class personaje_s {
    @Autowired
    personaje_r perrep;

    public ArrayList<personaje_m> obtenerPersonajes(){
        return (ArrayList<personaje_m>) perrep.findAll();
    }

    public personaje_m guardarPersonaje(personaje_m per){
        return perrep.save(per);
    }
}
