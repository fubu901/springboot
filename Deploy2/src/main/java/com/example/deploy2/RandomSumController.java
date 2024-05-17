package com.example.SpringBootExample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RandomSumController {

    private final Random random = new Random();

    @GetMapping("/sum")
    public int getRandomSum() {
        int num1 = random.nextInt(100); // Genera un numero intero casuale tra 0 e 99
        int num2 = random.nextInt(100);
        return num1 + num2;
    }
}

