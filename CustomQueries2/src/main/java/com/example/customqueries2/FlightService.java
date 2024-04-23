package com.example.customqueries2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class FlightService {
    private final FlightRepository flightRepository;

    @Autowired
    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> generateFlights(int count) {
        Random random = new Random();
        return IntStream.range(0, count)
                .mapToObj(i -> new Flight(
                        "Flight " + i,
                        generateRandomAirport(),
                        generateRandomAirport(),
                        generateRandomStatus()))
                .collect(Collectors.toList());
    }

    private String generateRandomAirport() {
        String[] airports = {"JFK", "LAX", "ORD", "ATL", "SFO", "DFW", "DEN", "LAS"};
        Random random = new Random();
        return airports[random.nextInt(airports.length)];
    }

    private Status generateRandomStatus() {
        Random random = new Random();
        int index = random.nextInt(Status.values().length);
        return Status.values()[index];
    }
}
