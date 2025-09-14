package utn;

import java.util.List;

public class Utilidades {
    // Metodo generico que imprime cualquier lista
    public static <T> void imprimirLista(List<T> lista) {
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }
}
