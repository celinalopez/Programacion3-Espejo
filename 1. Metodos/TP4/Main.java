package TP4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Producto> inventario = new ArrayList<>();

        addIfAbsent(inventario, new Producto("P-100", "Teclado", 1234));
        addIfAbsent(inventario, new Producto("P-200", "Mouse",   1112));

        // Mismo codigo
        addIfAbsent(inventario, new Producto("P-100", "Teclado mecanico", 456));

        System.out.println("Inventario (" + inventario.size() + "): " + inventario);

        // contains() usa equals(): deberia dar true 
        Producto buscado = new Producto("P-200", "Mouse inalambrico", 876);
        System.out.println("La lista contiene P-200?: " + inventario.contains(buscado));

        // Sets eliminan duplicados si equals/hashCode estan bien
        Set<Producto> conjunto = new HashSet<>(inventario);
        conjunto.add(new Producto("P-200", "Otro mouse", 1.00)); // no se agrega
        System.out.println("Set (" + conjunto.size() + "): " + conjunto);
    }

    // Evita duplicados en una List usando contains() porque depende de equals()
    static void addIfAbsent(List<Producto> lista, Producto p) {
        if (!lista.contains(p)) {
            lista.add(p);
        }
    }
}
