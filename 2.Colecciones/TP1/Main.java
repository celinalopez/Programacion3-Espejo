import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Juan", "10"));
        alumnos.add(new Alumno("Ana", "9"));
        alumnos.add(new Alumno("Luis", "8"));   
        //duplicado
        alumnos.add(new Alumno("Ana", "9"));

        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}