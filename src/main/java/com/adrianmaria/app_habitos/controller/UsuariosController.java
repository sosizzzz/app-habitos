package com.adrianmaria.app_habitos.controller;

import com.adrianmaria.app_habitos.model.Usuarios;
import com.adrianmaria.app_habitos.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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



}
