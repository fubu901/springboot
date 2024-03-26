package com.example.esercizio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class Esercizio3Application {

    public static void main(String[] args) {
        SpringApplication.run(Esercizio3Application.class, args);
    }

    // Gestisce la richiesta GET per restituire il nome
    @GetMapping("/name")
    public String getName(@RequestParam String name) {
        return "Il nome è: " + name;
    }

    // Gestisce la richiesta POST per restituire il nome al contrario
    @PostMapping("/name")
    public String reverseName(@RequestParam String name) {
        StringBuilder reversedName = new StringBuilder(name).reverse();
        return "Il nome al contrario è: " + reversedName;
    }
}

