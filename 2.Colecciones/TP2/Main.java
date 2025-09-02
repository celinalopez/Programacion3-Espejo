package TP2;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //2. Usar HashMap<String, Curso> donde la clave es el código del curso
        Map<String, Curso> cursos = new HashMap<>();

        // 3. Agregar varios cursos
        cursos.put("CURS101", new Curso("Programacion I", "Prof. Garcia"));
        cursos.put("CURS102", new Curso("Estructura de Datos", "Dra. Perez"));
        cursos.put("CURS103", new Curso("Bases de Datos", "Ing. Lopez"));

        // 4. Recuperar curso por clave
        String codigo = "CURS102";
        Curso cursoBuscado = cursos.get(codigo);
        if (cursoBuscado != null) {
            System.out.println("Curso encontrado: " + cursoBuscado);
        } else {
            System.out.println("No existe curso con codigo " + codigo);
        }

        System.out.println("\n--- Lista completa de cursos ---");

        // 5. Recorrer el mapa con entrySet
        for (Map.Entry<String, Curso> entry : cursos.entrySet()) {
            System.out.println("Código: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}

