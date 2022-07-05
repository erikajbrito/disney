package com.erika.disney.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping(path = "/{id}")
    public Optional<genero_m> obtenerGeneroPorId(@PathVariable("id") int id){
        return this.genServ.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<genero_m> obtenerGeneroPorNombre(@RequestParam("nombre") String nombre){
        return this.genServ.obtenerPorNombre(nombre);
    }

    @DeleteMapping("/{id}")
    public String eliminarPorId(@PathVariable("id") int id){
        boolean ok = this.genServ.eliminarGenero(id);
        if (ok){
            return "Se eliminó el género de id: " + id;
        }else{
            return "No se pudo eliminar el género de id: " + id;
        }
    }

}
