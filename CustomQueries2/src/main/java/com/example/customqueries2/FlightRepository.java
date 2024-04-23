package com.example.customqueries2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findByStatus(Status status);
    List<Flight> findByStatusIn(Status status1, Status status2);
}
