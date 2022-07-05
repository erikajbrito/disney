package com.erika.disney.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.erika.disney.models.personaje_pelicula_m;

@Repository
public interface personaje_pelicula_r extends CrudRepository<personaje_pelicula_m, Integer> {
    
}