/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.EjercicioPractico1.Service;

import com.EjercicioPractico1.Domain.Estudiante;
import java.util.List;

/**
 *
 * @author LABORATORIO 04
 */
public interface EstudianteService {
     //Se obtiene un listado de categorias en un list
    public List<Estudiante> getEstudiantes (boolean activos);
    
  // Se obtiene un Arbol, a partir del id de un categoria
    public Estudiante getEstudiante(Estudiante estudiante);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Estudiante estudiante);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Estudiante estudiante);
}
