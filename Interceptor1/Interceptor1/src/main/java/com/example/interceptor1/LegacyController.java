package com.example.interceptor1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LegacyController {

    @GetMapping("/legacy")
    public String getLegacyData() {
        return "This is just old code";
    }
}

