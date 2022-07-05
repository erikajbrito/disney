package com.erika.disney.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.erika.disney.models.pelicula_m;

@Repository
public interface pelicula_r extends CrudRepository<pelicula_m, Integer> {
    public abstract ArrayList<pelicula_m> findByTitulo(String titulo); 
    public abstract ArrayList<pelicula_m> findByCalificacion(int nota); 
}
