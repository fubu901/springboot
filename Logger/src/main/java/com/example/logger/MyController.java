package com.example.logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyController {

    private final Logger logger = LoggerFactory.getLogger(MyController.class);

    @GetMapping
    public String welcome() {
        logger.info("\u001B[32mWelcome message sent\u001B[0m");
        return "Welcome to my Spring Boot Application!";
    }

    @GetMapping("/exp")
    public ResponseEntity<Double> exponent(@Value("${custom.env.var1}") int var1,
                                           @Value("${custom.env.var2}") int var2) {
        logger.debug("Starting calculation of {}^{}", var1, var2);
        double result = Math.pow(var1, var2);
        logger.debug("Calculation result: {}", result);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/get-errors")
    public ResponseEntity<Void> getErrors() {
        throw new CustomErrorException("Custom error occurred!");
    }

}
