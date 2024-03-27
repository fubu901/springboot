package com.example.eserciziogetpost.name;

import org.springframework.web.bind.annotation.*;


@RestController
public class NameController {

    NameService nameService = new NameService();

    public NameController(NameService nameService) {
        this.nameService = nameService;
    }

    @GetMapping("/name")
    public String getName() {
        return nameService.getName();
    }

    @PostMapping("/name/reverse")
    public String reverseName(@RequestBody String name) {
        return nameService.reverseName(name);
    }

}
