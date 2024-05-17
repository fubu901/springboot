package com.example.deploy3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Deploy3Controller {

    @Value("${authCode}")
    private String authCode;

    @Value("${devName}")
    private String devName;

    @GetMapping("/greeting")
    public String getGreeting() {
        return String.format("Hello! My name is %s and my auth code is %s.", devName, authCode);
    }
}

