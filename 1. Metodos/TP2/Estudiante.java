
public class Estudiante extends Persona {
    private String legajo;
    private String carrera;

    // Constructor
    public Estudiante(String nombre, String apellido, int edad, String legajo, String carrera) {
        super(nombre, apellido, edad); 
        this.legajo = legajo;
        this.carrera = carrera;
    }

    // Getter and Setter
    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getCarrera() {
        return carrera;
    }   

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    // Override toString for display
    @Override
    public String toString() {
        return "Estudiante: " + super.toString() + ", Legajo: " + legajo + ", Carrera: " + carrera;
    }
}