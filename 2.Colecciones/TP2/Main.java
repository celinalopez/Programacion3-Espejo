package TP2;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Producto> productos = new HashSet<>();

        // Insertar productos 
        productos.add(new Producto("P001", "Laptop Lenovo"));
        productos.add(new Producto("P002", "Mouse Logitech"));
        productos.add(new Producto("P003", "Teclado Mecánico"));
        productos.add(new Producto("P001", "Laptop HP")); // duplicado por código

        // Recorrer e imprimir
        System.out.println("--- Lista de Productos en el Set ---");
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}
