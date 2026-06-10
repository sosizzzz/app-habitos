package com.adrianmaria.app_habitos.model;

import java.time.LocalDate;

public class Usuarios {

    private int id;
    private String username;
    private String email;
    private LocalDate createdAt;

    public Usuarios(int id, String username, String email, LocalDate createdAt) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.createdAt = createdAt;
    }

    public Usuarios(int id, String username) {
        this.id = id;
        this.username = username;
    }

    public Usuarios() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }
}
