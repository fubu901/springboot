package com.example.interceptor1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/")
public class MyApplication {

    @GetMapping("/time")
    public String getCurrentTime() {
        return "Current date/time: " + LocalDateTime.now();
    }
}



