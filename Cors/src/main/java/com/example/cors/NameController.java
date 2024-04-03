package com.example.cors;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000") // Abilita CORS per consentire le chiamate da questo indirizzo
public class NameController {

    @GetMapping("/api/name")
    public String getName(@RequestParam String name) {
        return "Il nome è: " + name;
    }

    @PostMapping("/api/name/reverse")
    public String reverseName(@RequestBody String name) {
        StringBuilder reversedName = new StringBuilder(name).reverse();
        return "Il nome al contrario è: " + reversedName.toString();
    }
}
