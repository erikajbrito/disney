package com.erika.disney.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.erika.disney.models.personaje_m;

@Repository
public interface personaje_r extends CrudRepository<personaje_m, Integer> {
    
}