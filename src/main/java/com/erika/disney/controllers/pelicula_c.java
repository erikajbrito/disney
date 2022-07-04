package com.erika.disney.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erika.disney.models.pelicula_m;
import com.erika.disney.services.pelicula_s;

@RestController
@RequestMapping("/pelicula")
public class pelicula_c {
    @Autowired
    pelicula_s penSer;

    @GetMapping()
    public ArrayList<pelicula_m> obtenerPeliculas(){
        return penSer.obtenerPeliculas();
    }

    @PostMapping()
    public pelicula_m guardarPelicula(@RequestBody pelicula_m pel){
        return this.penSer.guardarPelicula(pel);
    }
}
