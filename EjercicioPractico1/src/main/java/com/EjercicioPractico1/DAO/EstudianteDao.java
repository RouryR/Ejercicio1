/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.EjercicioPractico1.DAO;

import com.EjercicioPractico1.Domain.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author LABORATORIO 04
 */
public interface EstudianteDao extends JpaRepository <Estudiante,Long>{
    
}
