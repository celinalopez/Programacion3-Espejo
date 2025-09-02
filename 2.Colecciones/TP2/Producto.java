package TP2;
import java.util.Objects;

public class Producto {
    private String codigo;
    private String descripcion;

    public Producto(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // mismo objeto
        if (o == null || getClass() != o.getClass()) return false; // distinto tipo
        Producto producto = (Producto) o;
        return Objects.equals(codigo, producto.codigo); // comparación solo por código
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo); // hash basado en código
    }

    @Override
    public String toString() {
        return "Producto [Código=" + codigo + ", Descripción=" + descripcion + "]";
    }
}
