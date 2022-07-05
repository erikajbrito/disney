package com.erika.disney.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erika.disney.models.personaje_pelicula_m;
import com.erika.disney.repositories.personaje_pelicula_r;

@Service

public class personaje_pelicula_s {
    @Autowired
    personaje_pelicula_r genrep;

    public ArrayList<personaje_pelicula_m> obtenerPersonajePeliculas(){
        return (ArrayList<personaje_pelicula_m>) genrep.findAll();
    }

    public personaje_pelicula_m guardarPersonajePelicula(personaje_pelicula_m gen){
        return genrep.save(gen);
    }
}
