public class Alumno {
    private String nombre;
    private String nota;

    public Alumno(String nombre, String nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNota() {
        return nota;
    }
    public void setNota(String nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", nota=" + nota + "]";
    }  
}
