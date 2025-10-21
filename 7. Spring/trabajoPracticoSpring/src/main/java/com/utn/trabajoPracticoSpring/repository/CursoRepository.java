package com.utn.trabajoPracticoSpring.repository;

import com.utn.trabajoPracticoSpring.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CursoRepository extends JpaRepository<Curso,Long> {
    List<Curso> findByEstudiantes_Id(Long estudianteId);
}
