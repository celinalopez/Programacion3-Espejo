package com.utn.trabajoPracticoSpring.service;

import com.utn.trabajoPracticoSpring.entity.Estudiante;
import com.utn.trabajoPracticoSpring.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    public Estudiante crear(Estudiante e) {
        return estudianteRepository.save(e);
    }

    public List<Estudiante> listar() {
        return estudianteRepository.findAll();
    }
}
