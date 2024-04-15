package com.example.springrepository1;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String modelName;

    @Column(nullable = false)
    private String serialNumber;

    private Double currentPrice;
}
