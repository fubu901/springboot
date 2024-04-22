package com.example.customqueries1;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/flights")
public class FlightController {
    private final FlightRepository flightRepository;

    public FlightController(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @GetMapping("/seed")
    public List<Flight> seedFlights() {
        List<Flight> flights = generateFlights(50);
        return flightRepository.saveAll(flights);
    }

    @GetMapping
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    private List<Flight> generateFlights(int count) {
        Random random = new Random();
        return IntStream.range(0, count)
                .mapToObj(i -> new Flight(
                ))
                .collect(Collectors.toList());
    }

    private String generateRandomAirport() {
        String[] airports = {"JFK", "LAX", "ORD", "ATL", "SFO", "DFW", "DEN", "LAS"};
        Random random = new Random();
        return airports[random.nextInt(airports.length)];
    }
}

