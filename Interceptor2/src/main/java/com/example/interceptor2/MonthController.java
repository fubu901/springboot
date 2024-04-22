package com.example.interceptor2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Month;

@RestController
@RequestMapping("/months")
public class MonthController {

    @GetMapping
    public Month getMonth() {
        // Implementa la logica per restituire un oggetto Month in base alla richiesta
        return null;
    }
}
