package com.erika.disney.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

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

    public Optional<pelicula_m> obtenerPorId(int id){
        return pelrep.findById(id);
    }

    public ArrayList<pelicula_m> obtenerPorTitulo(String titulo){
        return pelrep.findByTitulo(titulo);
    }
    

    /**
     * @param id
     * @return borramos un genero
     */
    public boolean eliminarPelicula(int id){
        try{
            pelrep.deleteById(id);
            return true;
        } catch(Exception e){
            return false;
        }
    }
}
