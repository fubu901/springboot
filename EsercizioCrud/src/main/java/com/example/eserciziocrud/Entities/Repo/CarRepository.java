package com.example.eserciziocrud.Entities.Repo;

import com.example.eserciziocrud.Entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}

