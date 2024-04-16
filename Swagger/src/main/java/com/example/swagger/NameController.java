package com.example.swagger;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class NameController {

    @GetMapping("/name")
    public ResponseEntity<String> getName(@RequestParam String name) {
        return ResponseEntity.ok(name);
    }

    @PostMapping("/name/reverse")
    public ResponseEntity<String> reverseName(@RequestBody String name) {
        StringBuilder reversedName = new StringBuilder(name).reverse();
        return ResponseEntity.ok(reversedName.toString());
    }
}

