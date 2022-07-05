package com.erika.disney.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.erika.disney.models.personaje_m;

@Repository
public interface personaje_r extends CrudRepository<personaje_m, Integer> {
    public abstract ArrayList<personaje_m> findByNombre(String nombre); 
    public abstract ArrayList<personaje_m> findByEdad(int edad); 
    public abstract ArrayList<personaje_m> findByPeso(float peso); 
}