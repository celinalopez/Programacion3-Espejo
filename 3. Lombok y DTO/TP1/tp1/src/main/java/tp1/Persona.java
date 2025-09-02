package tp1;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor       // Constructor vacio
@AllArgsConstructor     // Constructor con todos los atributos
public class Persona {
    private String nombre;
    private int edad;
}

