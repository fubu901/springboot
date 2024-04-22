package com.example.customqueries1;
import org.springframework.data.jpa.repository.JpaRepository;



public interface FlightRepository extends JpaRepository<Flight, Long> {
}
