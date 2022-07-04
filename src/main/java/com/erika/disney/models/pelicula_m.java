package com.erika.disney.models;

import javax.persistence.*;


@Entity
@Table(name="pelicula")
public class pelicula_m {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;
    private String imagen;
    private String titulo;
    private String fechacreacion;
    private int calificacion;

    public pelicula_m(int id, String imagen, String titulo, String fechacreacion, int calificacion) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.fechacreacion = fechacreacion;
        this.calificacion = calificacion;
        this.id = id;
    }

    public String getImagen() {
        return imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFechacreacion() {
        return fechacreacion;
    }

    public int getCalificacion() {
        return calificacion;
    }


    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFechacreacion(String fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

}
