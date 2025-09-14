package utn;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main{
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Persona.class;

        // 1) Obtener e imprimir constructores
        System.out.println("Constructores de " + clazz.getName() + ":");
        for (Constructor<?> c : clazz.getDeclaredConstructors()) {
            System.out.println(" - " + c);
        }

        // 2) Instanciar un objeto utilizando reflection
        Constructor<?> ctor = clazz.getDeclaredConstructor(String.class, int.class);
        Object persona = ctor.newInstance("Ana", 22);
        System.out.println("\nInstancia creada por reflection: " + persona.getClass().getName());

        // 3) Modificar el valor de 'nombre' en tiempo de ejecución
        Field fNombre = clazz.getDeclaredField("nombre");
        fNombre.setAccessible(true);                 // "rompe" el encapsulamiento para acceder
        fNombre.set(persona, "Juana");
        System.out.println("\nNombre modificado por reflection.");

        // 4) Invocar un metodo que muestre la información de la persona
        Method mInfo = clazz.getDeclaredMethod("info");
        Object info = mInfo.invoke(persona);
        System.out.println("info(): " + info);

        // 5) “Modificar el encapsulamiento de saludar() hacia private usando reflection”

        Class<?> clazzPriv = PersonaPrivada.class;
        Object p2 = clazzPriv.getDeclaredConstructor(String.class, int.class).newInstance("Luis", 30);

        // Metodo privado "saludarPrivado"
        Method mPriv = clazzPriv.getDeclaredMethod("saludarPrivado");
        mPriv.setAccessible(true);  // habilita invocación pese a ser private
        Object saludo = mPriv.invoke(p2);
        System.out.println("\nInvocación de método private por reflection: " + saludo);
    }

    // Clase auxiliar para el punto 5
    public static class PersonaPrivada {
        private String nombre;
        private int edad;

        public PersonaPrivada(String nombre, int edad) {
            this.nombre = nombre;
            this.edad   = edad;
        }

        private String saludarPrivado() {
            return "Hola (private)";
        }
    }
}
