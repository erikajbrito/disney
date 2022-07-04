package com.erika.disney.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

import com.erika.disney.models.pelicula_m;
import com.erika.disney.repositories.pelicula_r;

import org.springframework.beans.factory.annotation.Autowired;


@Service
public class pelicula_s {
    @Autowired
    pelicula_r pelrep;

    public ArrayList<pelicula_m> obtenerPeliculas(){
        return (ArrayList<pelicula_m>) pelrep.findAll();
    }

    public pelicula_m guardarPelicula(pelicula_m pel){
        return pelrep.save(pel);
    }
}
