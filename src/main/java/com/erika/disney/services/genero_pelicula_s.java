package com.erika.disney.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erika.disney.models.genero_pelicula_m;
import com.erika.disney.repositories.genero_pelicula_r;

@Service
public class genero_pelicula_s {
    @Autowired
    genero_pelicula_r genrep;

    public ArrayList<genero_pelicula_m> obtenerGeneroPeliculas(){
        return (ArrayList<genero_pelicula_m>) genrep.findAll();
    }

    public genero_pelicula_m guardarGeneroPelicula(genero_pelicula_m gen){
        return genrep.save(gen);
    }
}
