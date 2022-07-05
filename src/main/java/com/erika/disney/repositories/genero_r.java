package com.erika.disney.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.erika.disney.models.genero_m;

@Repository
public interface genero_r extends CrudRepository<genero_m, Integer> {
    public abstract ArrayList<genero_m> findByNombre(String nombre); 
}
