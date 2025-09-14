package utn;
import java.util.Arrays;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Lista de enteros
        List<Integer> listaEnteros = Arrays.asList(10, 20, 30, 40);
        System.out.println("Lista de enteros:");
        Utilidades.imprimirLista(listaEnteros);

        // Lista de cadenas
        List<String> listaCadenas = Arrays.asList("Java", "Genéricos", "TP");
        System.out.println("\nLista de cadenas:");
        Utilidades.imprimirLista(listaCadenas);
    }
}