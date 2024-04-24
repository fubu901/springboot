package com.example.logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class CustomErrorException extends RuntimeException {
    public CustomErrorException(String message) {
        super(message);
    }
}


