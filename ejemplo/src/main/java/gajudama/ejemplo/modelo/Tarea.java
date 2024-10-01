package gajudama.ejemplo.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Tarea {

    @Id
    private Integer id;
    private String descripcion;
    private String detalles;
    private Boolean completado;

}
