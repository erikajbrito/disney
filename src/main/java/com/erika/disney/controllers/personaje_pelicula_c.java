package com.erika.disney.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erika.disney.models.personaje_pelicula_m;
import com.erika.disney.services.personaje_pelicula_s;

@RestController
@RequestMapping("/personaje_pelicula")

public class personaje_pelicula_c {
    @Autowired
    personaje_pelicula_s genServ;

    @GetMapping()
    public ArrayList<personaje_pelicula_m> obtenerPersonajePeliculas(){
        return genServ.obtenerPersonajePeliculas();
    }

    @PostMapping()
    public personaje_pelicula_m guardarPersonajePelicula(@RequestBody personaje_pelicula_m gen){
        return this.genServ.guardarPersonajePelicula(gen);
    }
}
