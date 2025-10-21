package com.utn.trabajoPracticoSpring.service;

import com.utn.trabajoPracticoSpring.entity.Profesor;
import com.utn.trabajoPracticoSpring.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService {

    @Autowired
    private ProfesorRepository profesorRepository;

    public Profesor crear(Profesor p) {
        return profesorRepository.save(p);
    }

    public List<Profesor> listar() {
        return profesorRepository.findAll();
    }
}
