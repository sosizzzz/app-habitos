package com.adrianmaria.app_habitos.repository;

import com.adrianmaria.app_habitos.model.Habitos;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class HabitosRepo {

    private List<Habitos> habitos = new ArrayList<>();
    private int current_id = 1;

    public HabitosRepo() {
        habitos.add(new Habitos(current_id++,"Leer"));
        habitos.add(new Habitos(current_id++,"Entrenar"));
        habitos.add(new Habitos(current_id++,"Meditar"));
        habitos.add(new Habitos(current_id++,"Caminar"));
    }

    public List<Habitos> findAll(){
        return habitos;
    }

    public Habitos findById (int id){

        for (Habitos i:habitos) {
            if (i.getId()==id) {
                return i;
            }
        }

        return new Habitos(0,"No encontrado");
    }

    public Habitos deleteById(int id){

        Habitos habito = findById(id);

        if (habito.getId() != 0) {
            habitos.remove(habito);
            return new Habitos(0,"Elimindado correctamente");

        }

        return new Habitos(0, "Error al eliminar");
    }

    public Habitos updateById(int id, Habitos datosNuevos){

        for (Habitos i:habitos){
            if (i.getId() == id) {
                i.setNombre(datosNuevos.getNombre());

                return i;
            }
        }

        return new Habitos(0, "No encontrado");
    }

}
