package gajudama.ejemplo.web;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.*;

import gajudama.ejemplo.modelo.Tarea;
import gajudama.ejemplo.repository.TareasRepository;

@RestController
@RequestMapping("/")
public class TareasController {
    
    private final TareasRepository tareasRepository;

    public TareasController(TareasRepository tareasRepository) {
        this.tareasRepository = tareasRepository;
    } 

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Tarea crearTarea(@RequestBody Tarea todo) {
        return tareasRepository.save(todo);
    }

    @GetMapping("/")
    public Iterable<Tarea> getTareas() {
        return tareasRepository.findAll();
    }
}
