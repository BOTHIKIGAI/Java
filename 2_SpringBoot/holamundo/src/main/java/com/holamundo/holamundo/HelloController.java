package com.holamundo.holamundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/saludo")
    public String saludar() {
        return "¡Hola Mundo!";
    }
}

