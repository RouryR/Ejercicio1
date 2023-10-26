/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.Controllers;

import com.EjercicioPractico1.Domain.Estudiante;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.EjercicioPractico1.Service.EstudianteService;

/**
 *
 * @author LABORATORIO 04
 */

@Controller
@Slf4j
@RequestMapping("/estudiante")
public class EstudianteController {
    
    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var estudiante = estudianteService.getEstudiantes(false);
        model.addAttribute("estudiantes", estudiante);
        model.addAttribute("totalEstudiante", estudiante.size());
        return "/estudiante/listado";
    }

    @GetMapping("/nuevo")
    public String estudiantesNuevo(Estudiante estudiante) {
        return "/estudiante/modifica";
    }
    //@Autowired
//    private FirebaseStorageServiceImpl firebaseStorageService;

    @PostMapping("/guardar")
    public String estudiantesGuardar(Estudiante estudiante) {
        
        estudianteService.save(estudiante);
        return "redirect:/estudiante/listado";
    }

    @GetMapping("/eliminar/{id}")
    public String estudiantesEliminar(Estudiante estudiante) {
        estudianteService.delete(estudiante);
        return "redirect:/estudiante/listado";
    }

    @GetMapping("/modificar/{id}")
    public String estudiantesModificar(Estudiante estudiante, Model model) {
        estudiante = estudianteService.getEstudiante(estudiante);
        model.addAttribute("estudiantes", estudiante);
        return "/estudiante/modifica";
    }
}
