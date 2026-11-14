package ru.ranepa.airline.infrastructure;

import java.util.ArrayList;
import java.util.List;
import ru.ranepa.airline.application.port.TicketRepository;
import ru.ranepa.airline.domain.Ticket;

public class InMemoryTicketRepository implements TicketRepository {
    private List<Ticket> items = new ArrayList<>();

    @Override
    public void add(Ticket item) {
        // TODO
    }

    @Override
    public List<Ticket> findAll() {
        // TODO
        return null;
    }

    @Override
    public Ticket findByName(String name) {
        // TODO
        return null;
    }
}
