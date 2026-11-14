package ru.ranepa.airline.application;

import java.util.List;
import ru.ranepa.airline.application.port.FlightRepository;
import ru.ranepa.airline.application.port.PassengerRepository;
import ru.ranepa.airline.application.port.TicketRepository;
import ru.ranepa.airline.domain.Ticket;

public class TicketService {
    private TicketRepository ticketRepository;
    private FlightRepository flightRepository;
    private PassengerRepository passengerRepository;

    public TicketService(TicketRepository ticketRepository, FlightRepository flightRepository,
                         PassengerRepository passengerRepository) {
        this.ticketRepository = ticketRepository;
        this.flightRepository = flightRepository;
        this.passengerRepository = passengerRepository;
    }

    public void sellEconomyTicket(String flightNumber, String passportNumber,
                                 double price, double handLuggageAllowance) {
        // TODO
    }

    public void sellBusinessTicket(String flightNumber, String passportNumber,
                                  double price, String meal, double baggageAllowance) {
        // TODO
    }

    public boolean returnTicket(String flightNumber, String passportNumber) {
        // TODO
        return false;
    }

    public List<Ticket> getAllTickets() {
        // TODO
        return null;
    }

    public double getRevenue(String flightNumber) {
        // TODO
        return 0;
    }
}
