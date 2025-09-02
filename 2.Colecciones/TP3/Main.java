package TP3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Crear un HashMap para almacenar cursos
        Map<String, Curso> cursos = new HashMap<>();

        // Agregar cursos al mapa
        cursos.put("CURS101", new Curso("Programación I", "Prof. García"));
        cursos.put("CURS102", new Curso("Estructura de Datos", "Dra. Pérez"));
        cursos.put("CURS103", new Curso("Bases de Datos", "Ing. López"));

        // Recuperar un curso por clave
        String codigo = "CURS102";
        Curso buscado = cursos.get(codigo);
        if (buscado != null) {
            System.out.println("Curso encontrado: " + buscado);
        } else {
            System.out.println("No existe un curso con código " + codigo);
        }

        // Recorrer todas las entradas con entrySet()
        System.out.println("\n--- Lista completa de cursos ---");
        for (Map.Entry<String, Curso> entry : cursos.entrySet()) {
            System.out.println("Código: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
