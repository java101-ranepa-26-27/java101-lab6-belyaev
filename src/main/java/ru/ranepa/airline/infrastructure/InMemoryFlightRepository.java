package ru.ranepa.airline.infrastructure;

import java.util.ArrayList;
import java.util.List;
import ru.ranepa.airline.application.port.FlightRepository;
import ru.ranepa.airline.domain.Flight;

public class InMemoryFlightRepository implements FlightRepository {
    private List<Flight> items = new ArrayList<>();

    @Override
    public void add(Flight item) {
        // TODO
    }

    @Override
    public List<Flight> findAll() {
        // TODO
        return null;
    }

    @Override
    public Flight findByName(String name) {
        // TODO
        return null;
    }
}
