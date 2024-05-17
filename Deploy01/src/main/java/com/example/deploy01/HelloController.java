package com.example.deploy01;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/info")
    public String getInfo() {
        return "Hello! My name is Fabio";
    }
}

