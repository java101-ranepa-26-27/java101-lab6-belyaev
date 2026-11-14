package ru.ranepa.airline.application;

import java.util.List;
import ru.ranepa.airline.application.port.FlightRepository;
import ru.ranepa.airline.domain.Flight;

public class FlightService {
    private FlightRepository repository;

    public FlightService(FlightRepository repository) {
        this.repository = repository;
    }

    public void addFlight(String number, String origin, String destination,
                          String departureTime, int capacity) {
        // TODO
    }

    public List<Flight> getAllFlights() {
        // TODO
        return null;
    }

    public List<Flight> findByDirection(String destination) {
        // TODO
        return null;
    }

    public List<Flight> getAvailableFlights() {
        // TODO
        return null;
    }

    public int getFreeSeats(String flightNumber) {
        // TODO
        return 0;
    }

    public double getLoadFactor(String flightNumber) {
        // TODO
        return 0;
    }
}
