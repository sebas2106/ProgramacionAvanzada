package co.edu.uniquindio.proyecto.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;
import java.util.Objects;
@Data
@AllArgsConstructor@ToString
@Document("clientes")
public class Cliente implements Serializable {
    @Id
    private String codigo;
    private String cedula;
    private String nombre;
    private String email;
    private String telefono;




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cliente cliente = (Cliente) o;

        if (!Objects.equals(codigo, cliente.codigo)) return false;
        if (!Objects.equals(cedula, cliente.cedula)) return false;
        if (!Objects.equals(nombre, cliente.nombre)) return false;
        if (!Objects.equals(email, cliente.email)) return false;
        return Objects.equals(telefono, cliente.telefono);
    }

    @Override
    public int hashCode() {
        int result = codigo != null ? codigo.hashCode() : 0;
        result = 31 * result + (cedula != null ? cedula.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        return result;
    }
}
