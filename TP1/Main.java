import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Estudiante> lista = new ArrayList<>();
        lista.add(new Estudiante("Juan", "Pérez", 25, "12345", "Ingeniería en Sistemas"));
        lista.add(new Estudiante("María", "Gómez", 21, "67890", "Diseño Gráfico"));
        lista.add(new Estudiante("Pedro", "López", 23, "54321", "Medicina"));

        System.out.println(lista);
    }
}
