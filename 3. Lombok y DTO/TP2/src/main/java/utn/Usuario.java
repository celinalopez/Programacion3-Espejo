package utn;

import lombok.Builder;
import lombok.Data;

@Data //genera automáticamente getters, setters, toString(), equals(), hashCode().
@Builder //agrega un patrón Builder que permite construir el objeto con una sintaxis fluida.
public class Usuario {
    private int id;
    private String nombre;
    private String email;
}