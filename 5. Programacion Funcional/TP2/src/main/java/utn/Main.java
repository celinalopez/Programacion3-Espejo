package utn;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Alumno> alumnos = Arrays.asList(
                new Alumno("Ana", 8.5, "Matematica"),
                new Alumno("Luis", 6.0, "Lengua"),
                new Alumno("Carla", 9.0, "Matematica"),
                new Alumno("Pedro", 7.5, "Historia"),
                new Alumno("Lucía", 5.0, "Lengua"),
                new Alumno("Juan", 10.0, "Historia"),
                new Alumno("Sofía", 8.0, "Lengua")
        );

        // 1. Obtener los nombres de los alumnos aprobados en mayusculas y ordenados
        System.out.println("1) Aprobados en mayusculas:");
        alumnos.stream()
                .filter(a -> a.getNota() >= 7)
                .map(a -> a.getNombre().toUpperCase())
                .sorted()
                .forEach(System.out::println);

        // 2. Calcular el promedio general de notas
        double promedio = alumnos.stream()
                .mapToDouble(Alumno::getNota)
                .average()
                .orElse(0.0); //si la lista esta vacia devuelve 0 en lugar de fallar
        System.out.println("\n2) Promedio general: " + promedio);

        // 3. Agrupar alumnos por curso
        System.out.println("\n3) Alumnos agrupados por curso:");
        Map<String, List<Alumno>> cursoAlumnos = alumnos.stream()
                .collect(Collectors.groupingBy(Alumno::getCurso));

        cursoAlumnos.forEach((curso, lista) -> {
            System.out.println(curso + ": " + lista);
        });

        // 4. Obtener los 3 mejores promedios
        System.out.println("\n4) Top 3 alumnos:");
        alumnos.stream()
                .sorted(Comparator.comparingDouble(Alumno::getNota).reversed())
                .limit(3)
                .forEach(System.out::println);
    }
}
