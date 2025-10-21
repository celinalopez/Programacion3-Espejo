package com.utn.trabajoPracticoSpring.controller;

import com.utn.trabajoPracticoSpring.entity.Profesor;
import com.utn.trabajoPracticoSpring.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profesores")
public class ProfesorController {

    @Autowired
    private ProfesorService profesorService;

    @PostMapping
    public Profesor crear(@RequestBody Profesor p) {
        return profesorService.crear(p);
    }

    @GetMapping
    public List<Profesor> listar() {
        return profesorService.listar();
    }
}
