package com.adrianmaria.app_habitos.repository;

import com.adrianmaria.app_habitos.model.Habitos;
import com.adrianmaria.app_habitos.model.Usuarios;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class UsuariosRepo {

    private List<Usuarios> usuarios = new ArrayList<>();
    private int current_id = 1;

    public UsuariosRepo() {

        usuarios.add(new Usuarios(current_id++, "Adrian", "Adrian@gmail.com", LocalDate.now()));
        usuarios.add(new Usuarios(current_id++, "Maria", "Maria@gmail.com", LocalDate.now()));
        usuarios.add(new Usuarios(current_id++, "Daniel", "Daniel@gmail.com", LocalDate.now()));
        usuarios.add(new Usuarios(current_id++, "Elba", "Elba@gmail.com", LocalDate.now()));
    }

    public List<Usuarios> findAll (){
        return usuarios;
    }

    public Usuarios findById(int id){

        for (Usuarios i:usuarios){
            if (i.getId()==id){
                return i;
            }
        }


        return new Usuarios(0,"No encontrado");

    }
}
