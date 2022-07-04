package com.erika.disney.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erika.disney.models.genero_m;
import com.erika.disney.repositories.genero_r;

@Service
public class genero_s {
    @Autowired
    genero_r genrep;

    public ArrayList<genero_m> obtenerGeneros(){
        return (ArrayList<genero_m>) genrep.findAll();
    }

    public genero_m guardarGenero(genero_m gen){
        return genrep.save(gen);
    }
}
