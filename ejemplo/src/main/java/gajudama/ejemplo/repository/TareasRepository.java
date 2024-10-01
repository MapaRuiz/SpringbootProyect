package gajudama.ejemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import gajudama.ejemplo.modelo.Tarea;


// operaciones CRUD
@Repository
public interface TareasRepository extends JpaRepository<Tarea, Long> {
    // save
    // grabar una tarea en la base de datos
    // parámetro es un objeto de tipo Tarea
    Tarea save( Tarea todo);
}
