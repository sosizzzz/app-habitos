package com.adrianmaria.app_habitos.service;

import com.adrianmaria.app_habitos.model.Habitos;
import com.adrianmaria.app_habitos.repository.HabitosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitosService {

    @Autowired
    HabitosRepo repo;

    public HabitosService(HabitosRepo repo) {
        this.repo = repo;
    }

    public List<Habitos> findAll(){
        return repo.findAll();
    }

    public Habitos findById(int id){
        return repo.findById(id);
    }

    public Habitos deleteById(int id){
        return repo.deleteById(id);
    }
}
