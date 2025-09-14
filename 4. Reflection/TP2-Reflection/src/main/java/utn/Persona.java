package utn;

public class Persona {
    private String nombre;
    private int edad;

    public Persona() {
        this("Sin nombre", 0);
    }
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad   = edad;
    }

    public String saludar() {
        return "Hola";
    }

    public String info() {
        return "Persona{nombre='" + nombre + "', edad=" + edad + "}";
    }


}
