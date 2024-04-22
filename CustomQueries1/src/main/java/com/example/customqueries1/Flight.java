package com.example.customqueries1;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String fromAirport;
    private String toAirport;
    private Status status;

    // Costruttori, getter e setter
}

enum Status {
    ON_TIME,
    DELAYED,
    CANCELLED
}

