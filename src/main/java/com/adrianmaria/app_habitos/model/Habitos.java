package com.adrianmaria.app_habitos.model;


public class Habitos {

    private int id;
    private String nombre;

    public Habitos(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Habitos() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
