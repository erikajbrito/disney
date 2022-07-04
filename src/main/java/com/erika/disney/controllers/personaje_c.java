package com.erika.disney.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erika.disney.models.personaje_m;
import com.erika.disney.services.personaje_s;

@RestController
@RequestMapping("/personaje")
public class personaje_c {
    @Autowired
    personaje_s perSer;

    @GetMapping()
    public ArrayList<personaje_m> obtenerPersonajes(){
        return perSer.obtenerPersonajes();
    }

    @PostMapping()
    public personaje_m guardarPersonaje(@RequestBody personaje_m per){
        return this.perSer.guardarPersonaje(per);
    }
}
