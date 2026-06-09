package com.adrianmaria.app_habitos.controller;

import com.adrianmaria.app_habitos.repository.HabitosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hola")
public class HolaController {

    @Autowired
    HabitosRepo repo;

    @GetMapping
    public String hola(){
        return "hola mundillo";
    }

}
