package utn;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear Productos con constructor
        Producto p1 = new Producto("P01", "Libro Java", 1500.0, "Juan Pérez");
        Producto p2 = new Producto("P02", "Libro Python", 1200.0, "Ana López");

        // Crear ProductoDTO con set
        ProductoDTO dto1 = new ProductoDTO();
        dto1.setCodigo("P01");
        dto1.setNombre("Libro Java");
        dto1.setPrecio(1500.0);

        ProductoDTO dto2 = new ProductoDTO();
        dto2.setCodigo("P02");
        dto2.setNombre("Libro Python");
        dto2.setPrecio(1200.0);

        List<ProductoDTO> lista = new ArrayList<>();
        lista.add(dto1);
        lista.add(dto2);

        System.out.println("Lista de ProductoDTO:");
        for (ProductoDTO dto : lista) {
            System.out.println(dto);
        }

    }
}
