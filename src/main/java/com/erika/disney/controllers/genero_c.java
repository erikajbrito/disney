package com.erika.disney.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erika.disney.models.genero_m;
import com.erika.disney.services.genero_s;

@RestController
@RequestMapping("/genero")
public class genero_c {
    @Autowired
    genero_s genServ;

    @GetMapping()
    public ArrayList<genero_m> obtenerGeneros(){
        return genServ.obtenerGeneros();
    }

    @PostMapping()
    public genero_m guardarGenero(@RequestBody genero_m gen){
        return this.genServ.guardarGenero(gen);
    }
}
