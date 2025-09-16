package utn;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = List.of(
                new Producto("Teclado",      "Perifericos",  150.0,  20),
                new Producto("Mouse",        "Perifericos",   80.0,  50),
                new Producto("Monitor 24\"", "Monitores",     220.0, 15),
                new Producto("Monitor 27\"", "Monitores",     320.0,  8),
                new Producto("Notebook",     "Computación",  1200.0,  5),
                new Producto("Hub USB",      "Perifericos",   120.0, 30),
                new Producto("SSD 1TB",      "Almacenamiento",180.0, 25),
                new Producto("HDD 2TB",      "Almacenamiento", 90.0, 40)
        );

        // 1) Listar productos con precio > 100 ordenados por precio descendente
        System.out.println("1) Precio > 100, descendente:");
        productos.stream()
                .filter(p -> p.precio() > 100) // lambda que recibe cada Producto p y devuelve true si su precio es mayor a 100
                .sorted(Comparator.comparingDouble(Producto::precio).reversed())
                .forEach(p -> System.out.printf("- %s (%s) $%.2f%n", p.nombre(), p.categoria(), p.precio()));

        // 2) Agrupar productos por categoria y calcular stock total
        System.out.println("\n2) Stock total por categoria:");
        Map<String, Integer> stockPorCategoria = productos.stream()
                .collect(groupingBy(Producto::categoria, summingInt(Producto::stock))); //operacion terminal que acumula resultados
        stockPorCategoria.forEach((cat, total) -> System.out.printf("- %s: %d unidades%n", cat, total));

        // 3) String con nombre y precio separado por ; usando map + collect(joining)
        System.out.println("\n3) Cadena unificada (nombre y precio):");
        String reporte = productos.stream()
                .map(p -> "%s $%.2f".formatted(p.nombre(), p.precio())) //lambda que recibe cada producto y devuelve un String con su nombre y precio formateados
                .collect(joining(" ; "));
        System.out.println(reporte);

        // 4a) Precio promedio general
        double promedioGeneral = productos.stream()
                .mapToDouble(Producto::precio) //metodo de referencia
                .average()
                .orElse(0.0);
        System.out.printf("%n4a) Precio promedio general: $%.2f%n", promedioGeneral);

        // 4b) Precio promedio por categoría
        System.out.println("4b) Precio promedio por categoría:");
        Map<String, Double> promedioPorCategoria = productos.stream()
                .collect(groupingBy(Producto::categoria, averagingDouble(Producto::precio)));
        promedioPorCategoria.forEach((cat, prom) -> System.out.printf("- %s: $%.2f%n", cat, prom));
    }
}
