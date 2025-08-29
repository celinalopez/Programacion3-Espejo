public class Estudiante extends Persona {
    private String legajo;
    private String carrera;

    public Estudiante(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Estudiante(String nombre, String apellido, int edad, String legajo, String carrera) {
        super(nombre, apellido, edad);
        this.legajo = legajo;
        this.carrera = carrera;
    }

    public String getLegajo() { return legajo; }
    public void setLegajo(String legajo) { this.legajo = legajo; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    @Override
    public String toString() {
        return String.format("Estudiante{ %s, legajo=%s, carrera='%s' }",
                super.toString(), legajo, carrera);
    }
}
