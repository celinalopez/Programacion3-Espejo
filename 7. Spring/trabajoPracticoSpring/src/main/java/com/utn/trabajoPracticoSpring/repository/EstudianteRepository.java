package com.utn.trabajoPracticoSpring.repository;

import com.utn.trabajoPracticoSpring.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante,Long> {
}
