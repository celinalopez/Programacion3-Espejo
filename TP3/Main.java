import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Estudiantes de ejemplo
        Estudiante e1 = new Estudiante("Juan", "Pérez", 25, "12345", "Ingeniería en Sistemas");
        Estudiante e2 = new Estudiante("María", "Gómez", 21, "67890", "Diseño Gráfico");
        Estudiante e3 = new Estudiante("Pedro", "López", 23, "54321", "Medicina");

        // Curso 1
        Curso estructuras = new Curso("Estructuras de Datos", "Prof. Carlos Ruiz");
        estructuras.agregarEstudiante(e1);
        estructuras.agregarEstudiante(e2);

        // Curso 2
        Curso programacion = new Curso("Programación I");
        programacion.agregarEstudiante(e3);

        // Imprimir cursos
        List<Curso> cursos = new ArrayList<>();
        cursos.add(estructuras);
        cursos.add(programacion);

        for (Curso c : cursos) {
            System.out.println(c);
        }
    }
}
