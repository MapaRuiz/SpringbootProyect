package gajudama.ejemplo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Holamundo {

    @GetMapping("/hola")
    public String hola(){
        return "Hola";

    }

    @GetMapping("/adios")
    public String adios(){
        return "Adios";

    }
}
