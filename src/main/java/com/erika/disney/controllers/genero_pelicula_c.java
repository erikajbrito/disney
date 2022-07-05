package com.erika.disney.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erika.disney.models.genero_pelicula_m;
import com.erika.disney.services.genero_pelicula_s;

@RestController
@RequestMapping("/genero_pelicula")

public class genero_pelicula_c {
    @Autowired
    genero_pelicula_s genServ;

    @GetMapping()
    public ArrayList<genero_pelicula_m> obtenerGeneroPeliculas(){
        return genServ.obtenerGeneroPeliculas();
    }

    @PostMapping()
    public genero_pelicula_m guardarGeneroPelicula(@RequestBody genero_pelicula_m gen){
        return this.genServ.guardarGeneroPelicula(gen);
    }
}
