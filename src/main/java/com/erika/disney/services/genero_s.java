package com.erika.disney.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erika.disney.models.genero_m;
import com.erika.disney.repositories.genero_r;

@Service
public class genero_s {
    @Autowired
    genero_r genrep;

    public ArrayList<genero_m> obtenerGeneros(){
        return (ArrayList<genero_m>) genrep.findAll();
    }

    public genero_m guardarGenero(genero_m gen){
        return genrep.save(gen);
    }

    public Optional<genero_m> obtenerPorId(int id){
        return genrep.findById(id);
    }

    public ArrayList<genero_m> obtenerPorNombre(String nombre){
        return genrep.findByNombre(nombre);
    }

    /**
     * @param id
     * @return borramos un genero
     */
    public boolean eliminarGenero(int id){
        try{
            genrep.deleteById(id);
            return true;
        } catch(Exception e){
            return false;
        }
    }
}
