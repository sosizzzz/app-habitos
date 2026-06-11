package com.adrianmaria.app_habitos.controller;

import com.adrianmaria.app_habitos.model.Usuarios;
import com.adrianmaria.app_habitos.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    @Autowired
    UsuariosService service;

    @GetMapping
    public List<Usuarios> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Usuarios findById(@PathVariable int id){
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public Usuarios deleteById(@PathVariable int id){
        return service.deletebyId(id);
    }

    @PutMapping("/{id}")
    public Usuarios updateById(@PathVariable int id, @RequestBody Usuarios nuevosDatos){
        return service.updateById(id, nuevosDatos);
    }



}
