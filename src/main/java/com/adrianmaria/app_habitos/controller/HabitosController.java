package com.adrianmaria.app_habitos.controller;

import com.adrianmaria.app_habitos.model.Habitos;
import com.adrianmaria.app_habitos.model.Usuarios;
import com.adrianmaria.app_habitos.repository.HabitosRepo;
import com.adrianmaria.app_habitos.service.HabitosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/habitos")
public class HabitosController {

    @Autowired
    HabitosService service;

    @GetMapping
    public List<Habitos>findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Habitos findById(@PathVariable int id){
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public Habitos deleteById(@PathVariable int id){
        return service.deleteById(id);
    }

    @PutMapping("/{id}")
    public Habitos updateById(@PathVariable int id, @RequestBody Habitos nuevosDatos){
        return service.updateById(id,nuevosDatos);
    }

}
