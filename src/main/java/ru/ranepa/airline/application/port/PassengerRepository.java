package ru.ranepa.airline.application.port;

import java.util.List;
import ru.ranepa.airline.domain.Passenger;

public interface PassengerRepository {
    void add(Passenger item);

    List<Passenger> findAll();

    Passenger findByName(String name);
}
