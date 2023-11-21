package com.holamundo.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;


public class HelloController {

    @GetMapping("/saludo")
    public String saludar() {
        return "¡Hola Mundo!";
    }

}
