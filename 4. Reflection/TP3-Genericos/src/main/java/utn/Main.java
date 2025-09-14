package utn;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Caja con String
        Caja<String> cajaTexto = new Caja<>("Hola Mundo");
        System.out.println("Contenido de cajaTexto: " + cajaTexto.getContenido());

        // Caja con Integer
        Caja<Integer> cajaNumero = new Caja<>(123);
        System.out.println("Contenido de cajaNumero: " + cajaNumero.getContenido());

        // Uso de colecciones CON genéricos
        List<String> listaGenerica = new ArrayList<>();
        listaGenerica.add("Uno");
        listaGenerica.add("Dos");
        // listaGenerica.add(10); // Error en compilación: seguridad de tipos
        System.out.println("\nLista genérica (List<String>): " + listaGenerica);

        // Uso de colecciones SIN genéricos
        List listaSinGenericos = new ArrayList();
        listaSinGenericos.add("Hola");
        listaSinGenericos.add(25);  // Permitido pero puede dar problemas
        System.out.println("Lista sin genéricos: " + listaSinGenericos);

        // Riesgo de casting en listas sin genéricos
        try {
            String texto = (String) listaSinGenericos.get(1); // Error en runtime
            System.out.println("Texto: " + texto);
        } catch (ClassCastException e) {
            System.out.println("Error en tiempo de ejecución: " + e);
        }
    }
}
