import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private String profesor; 
    private List<Estudiante> listaDeEstudiantes;

    public Curso() {
    }

    public Curso(String nombre) {
        this(nombre, null);
    }

    public Curso(String nombre, String profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.listaDeEstudiantes = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public String getProfesor() { return profesor; }

    public void agregarEstudiante(Estudiante e) {
        if (e != null) listaDeEstudiantes.add(e);
    }

    public int getCantidadAlumnos() {
        return listaDeEstudiantes.size();
    }

    public List<Estudiante> getListaDeEstudiantes() {
        return listaDeEstudiantes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curso: ").append(nombre).append('\n');
        if (profesor != null && !profesor.isEmpty()) {
            sb.append("Profesor: ").append(profesor).append('\n');
        }
        sb.append("Cantidad de alumnos: ").append(getCantidadAlumnos()).append('\n');

        // Lista numerada de estudiantes (1..n)
        for (int i = 0; i < listaDeEstudiantes.size(); i++) {
            sb.append(i + 1).append(". ")
              .append(listaDeEstudiantes.get(i).toString())
              .append('\n');
        }
        return sb.toString();
    }
}
