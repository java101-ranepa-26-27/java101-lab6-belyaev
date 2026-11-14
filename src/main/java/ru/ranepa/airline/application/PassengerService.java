package ru.ranepa.airline.application;

import java.util.List;
import ru.ranepa.airline.application.port.PassengerRepository;
import ru.ranepa.airline.domain.Passenger;

public class PassengerService {
    private PassengerRepository repository;

    public PassengerService(PassengerRepository repository) {
        this.repository = repository;
    }

    public void addPassenger(String name, String passportNumber, String phone) {
        // TODO
    }

    public List<Passenger> getAllPassengers() {
        // TODO
        return null;
    }

    public Passenger findByName(String name) {
        // TODO
        return null;
    }
}
