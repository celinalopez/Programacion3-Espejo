package TP5;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Producto> productos = new HashSet<>();

        Producto p1 = new Producto("P-100", "Teclado", 999.99);
        Producto p2 = new Producto("P-200", "Mouse", 499.50);
        // Mismo codigo que p1 con distinto nombre y precio
        Producto p3 = new Producto("P-100", "Teclado mecanico", 1299.00);

        System.out.println("Agrega p1: " + productos.add(p1)); // true
        System.out.println("Agrega p2: " + productos.add(p2)); // true
        System.out.println("Agrega p3 (duplicado por codigo): " + productos.add(p3)); // false

        System.out.println("\nTamaño del HashSet: " + productos.size()); // 2
        System.out.println("Contenido del HashSet:");
        for (Producto p : productos) {
            System.out.println(" - " + p);
        }

        // usa hashCode + equals
        Producto buscado = new Producto("P-100", "Cualquier nombre", 0.0);
        System.out.println("\nContiene P-100?: " + productos.contains(buscado)); // true
    }
}
