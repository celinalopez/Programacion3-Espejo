package com.utn.trabajoPracticoSpring.controller;

import com.utn.trabajoPracticoSpring.entity.Curso;
import com.utn.trabajoPracticoSpring.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public List<Curso> getAllCursos() {
        return cursoService.getAllCursos();
    }

    @PostMapping
    public Curso createCurso(@RequestBody Curso curso) {
        return cursoService.createCurso(curso);
    }

    @GetMapping("/{id}")
    public Curso getCursoById(@PathVariable Long id) {
        return cursoService.getCursoById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCursoById(@PathVariable Long id) {
        cursoService.deleteCursoById(id);
    }

    @PostMapping("/{cursoId}/agregar-estudiante/{estudianteId}")
    public Curso agregarEstudiante(@PathVariable Long cursoId, @PathVariable Long estudianteId) {
        return cursoService.agregarEstudiante(cursoId, estudianteId);
    }
}
