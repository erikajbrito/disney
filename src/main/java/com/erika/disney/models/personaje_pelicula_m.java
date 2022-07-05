package com.erika.disney.models;
import javax.persistence.*;

@Entity
@Table(name="personaje_pelicula")
public class personaje_pelicula_m {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;
    private int id_personaje;
    private int id_pelicula;

    public personaje_pelicula_m(int id, int id_personaje, int id_pelicula) {
        this.id = id;
        this.id_personaje = id_personaje;
        this.id_pelicula = id_pelicula;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId_personaje() {
        return id_personaje;
    }
    public void setId_personaje(int id_personaje) {
        this.id_personaje = id_personaje;
    }
    public int getId_pelicula() {
        return id_pelicula;
    }
    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    
}
