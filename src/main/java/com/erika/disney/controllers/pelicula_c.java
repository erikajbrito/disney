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

    @GetMapping(path = "/{id}")
    public Optional<pelicula_m> obtenerPeliculaPorId(@PathVariable("id") int id){
        return this.penSer.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<pelicula_m> obtenerPeliculaPorTitulo(@RequestParam("titulo") String titulo){
        return this.penSer.obtenerPorTitulo(titulo);
    }


    @DeleteMapping("/{id}")
    public String eliminarPorId(@PathVariable("id") int id){
        boolean ok = this.penSer.eliminarPelicula(id);
        if (ok){
            return "Se eliminó el género de id: " + id;
        }else{
            return "No se pudo eliminar el género de id: " + id;
        }
    }
}
