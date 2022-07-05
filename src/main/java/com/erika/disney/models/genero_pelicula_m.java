package com.erika.disney.models;

import javax.persistence.*;

@Entity
@Table(name="genero_pelicula")
public class genero_pelicula_m {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;
    private int id_genero;
    private int id_pelicula;

    
    public genero_pelicula_m(int id, int id_genero, int id_pelicula) {
        this.id = id;
        this.id_genero = id_genero;
        this.id_pelicula = id_pelicula;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId_genero() {
        return id_genero;
    }
    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }
    public int getId_pelicula() {
        return id_pelicula;
    }
    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    
}
