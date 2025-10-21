package com.utn.trabajoPracticoSpring.controller;

import com.utn.trabajoPracticoSpring.entity.Curso;
import com.utn.trabajoPracticoSpring.entity.Estudiante;
import com.utn.trabajoPracticoSpring.service.CursoService;
import com.utn.trabajoPracticoSpring.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @Autowired
    private CursoService cursoService;

    @PostMapping
    public Estudiante crear(@RequestBody Estudiante e) {
        return estudianteService.crear(e);
    }

    @GetMapping
    public List<Estudiante> listar() {
        return estudianteService.listar();
    }

    // Cursos donde está el estudiante
    @GetMapping("/{id}/cursos")
    public List<Curso> cursosDeEstudiante(@PathVariable Long id) {
        return cursoService.cursosDeEstudiante(id);
    }
}
