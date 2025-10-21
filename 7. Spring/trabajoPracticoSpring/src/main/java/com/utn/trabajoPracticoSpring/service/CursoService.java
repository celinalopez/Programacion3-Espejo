package com.utn.trabajoPracticoSpring.service;

import com.utn.trabajoPracticoSpring.entity.Curso;
import com.utn.trabajoPracticoSpring.entity.Estudiante;
import com.utn.trabajoPracticoSpring.entity.Profesor;
import com.utn.trabajoPracticoSpring.repository.CursoRepository;
import com.utn.trabajoPracticoSpring.repository.EstudianteRepository;
import com.utn.trabajoPracticoSpring.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private ProfesorRepository profesorRepository;

    @Autowired
    private EstudianteRepository estudianteRepository;

    public List<Curso> getAllCursos() {
        return cursoRepository.findAll();
    }

    public Curso getCursoById(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }

    // Crear curso con estudiante y profesor existentes
    public Curso createCurso(Curso curso) {
        // Validar profesor
        if (curso.getProfesor() == null || curso.getProfesor().getId() == null) {
            throw new RuntimeException("Debe indicar profesor.id");
        }
        Profesor prof = profesorRepository.findById(curso.getProfesor().getId()).orElse(null);
        if (prof == null) {
            throw new RuntimeException("Profesor no encontrado");
        }
        curso.setProfesor(prof);

        // Validar estudiantes
        if (curso.getEstudiantes() == null || curso.getEstudiantes().isEmpty()) {
            throw new RuntimeException("Debe indicar al menos un estudiante existente");
        }
        Set<Estudiante> validados = new HashSet<>();
        for (Estudiante e : curso.getEstudiantes()) {
            if (e.getId() == null) {
                throw new RuntimeException("Cada estudiante debe tener id");
            }
            Estudiante est = estudianteRepository.findById(e.getId()).orElse(null);
            if (est == null) {
                throw new RuntimeException("Estudiante con id " + e.getId() + " no encontrado");
            }
            validados.add(est);
        }
        curso.setEstudiantes(validados);

        return cursoRepository.save(curso);
    }

    public void deleteCursoById(Long id) {
        cursoRepository.deleteById(id);
    }

    // Agregar un estudiante existente a un curso
    public Curso agregarEstudiante(Long cursoId, Long estudianteId) {
        Curso curso = cursoRepository.findById(cursoId).orElse(null);
        if (curso == null) {
            throw new RuntimeException("Curso no encontrado");
        }
        Estudiante estudiante = estudianteRepository.findById(estudianteId).orElse(null);
        if (estudiante == null) {
            throw new RuntimeException("Estudiante no encontrado");
        }
        curso.getEstudiantes().add(estudiante);
        return cursoRepository.save(curso);
    }

    // Listar cursos de un estudiante
    public List<Curso> cursosDeEstudiante(Long estudianteId) {
        return cursoRepository.findByEstudiantes_Id(estudianteId);
    }
}
