package com.adrianmaria.app_habitos.service;

import com.adrianmaria.app_habitos.model.Usuarios;
import com.adrianmaria.app_habitos.repository.UsuariosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsuariosService {

    @Autowired
    UsuariosRepo repo;

    public List<Usuarios> findAll(){
        return repo.findAll();
    }

    public Usuarios findById (int id){
        return repo.findById(id);
    }

    public Usuarios deletebyId(int id) {
        return repo.deleteById(id);
    }

    public Usuarios updateById(int id, Usuarios nuevosDatos){
       return repo.updateById(id, nuevosDatos);
    }
}
