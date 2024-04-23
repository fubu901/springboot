package com.example.customqueries2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightQueryController {
    private final FlightRepository flightRepository;

    @Autowired
    public FlightQueryController(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @GetMapping
    public List<Flight> getAllFlights(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("fromAirport").ascending());
        Page<Flight> flightPage = flightRepository.findAll(pageable);
        return flightPage.getContent();
    }

    @GetMapping("/ontime")
    public List<Flight> getOnTimeFlights() {
        return flightRepository.findByStatus(Status.ON_TIME);
    }

    @GetMapping("/custom")
    public List<Flight> getCustomFlights(
            @RequestParam("p1") Status p1,
            @RequestParam("p2") Status p2
    ) {
        return flightRepository.findByStatusIn(p1, p2);
    }
}

