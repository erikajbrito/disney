package com.erika.disney.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.erika.disney.models.usuario_m;


@Repository
public interface usuario_r extends JpaRepository<usuario_m, Integer> {
    public usuario_m findByName(String name);
}
