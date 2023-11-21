package com.holamundo.holamundo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HelloCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String...args) {
        System.out.println("Hola mundo desde la terminal");
    }

}
