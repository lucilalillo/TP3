package com.example.tp3.Modelo;

public class Pelicula {
    private String titulo, descripcion, actor, director;
    private int foto;

    public Pelicula(String titulo, String descripcion, int foto, String actor, String director) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.foto = foto;
        this.actor = actor;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}

