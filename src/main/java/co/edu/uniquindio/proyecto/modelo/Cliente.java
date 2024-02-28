package co.edu.uniquindio.proyecto.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;
@Document("clientes")
public class Cliente implements Serializable {
    @Id
    private String codigo;
    private String cedula;
    private String nombre;
    private String email;
    private String telefono;
}
