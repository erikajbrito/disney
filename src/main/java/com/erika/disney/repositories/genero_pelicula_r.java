package com.erika.disney.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.erika.disney.models.genero_pelicula_m;

@Repository
public interface genero_pelicula_r extends CrudRepository<genero_pelicula_m, Integer> {
    
}