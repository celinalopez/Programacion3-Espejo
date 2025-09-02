package tp1;
public class Main {
    public static void main(String[] args) {
        // Usando constructor vacio
        Persona persona1 = new Persona();
        persona1.setNombre("Ana");
        persona1.setEdad(25);

        System.out.println("Persona 1: " + persona1.getNombre() + ", Edad: " + persona1.getEdad());

        // Usando constructor con parametros
        Persona persona2 = new Persona("Juan", 30);

        System.out.println("Persona 2: " + persona2.getNombre() + ", Edad: " + persona2.getEdad());
    }
}