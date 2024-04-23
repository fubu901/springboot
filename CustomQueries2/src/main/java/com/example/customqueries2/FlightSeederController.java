package com.example.customqueries2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class FlightSeederController {
    private final FlightService flightService;

    @Autowired
    public FlightSeederController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/flights/seed")
    public List<Flight> seedFlights(@RequestParam(required = false, defaultValue = "100") int n) {
        return flightService.generateFlights(n);
    }
}
