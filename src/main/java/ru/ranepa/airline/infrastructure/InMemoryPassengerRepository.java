package ru.ranepa.airline.infrastructure;

import java.util.ArrayList;
import java.util.List;
import ru.ranepa.airline.application.port.PassengerRepository;
import ru.ranepa.airline.domain.Passenger;

public class InMemoryPassengerRepository implements PassengerRepository {
    private List<Passenger> items = new ArrayList<>();

    @Override
    public void add(Passenger item) {
        // TODO
    }

    @Override
    public List<Passenger> findAll() {
        // TODO
        return null;
    }

    @Override
    public Passenger findByName(String name) {
        // TODO
        return null;
    }
}
