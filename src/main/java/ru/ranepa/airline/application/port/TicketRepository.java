package ru.ranepa.airline.application.port;

import java.util.List;
import ru.ranepa.airline.domain.Ticket;

public interface TicketRepository {
    void add(Ticket item);

    List<Ticket> findAll();

    Ticket findByName(String name);
}
