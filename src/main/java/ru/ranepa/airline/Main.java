package ru.ranepa.airline;

import java.util.Scanner;
import ru.ranepa.airline.application.FlightService;
import ru.ranepa.airline.application.PassengerService;
import ru.ranepa.airline.application.TicketService;
import ru.ranepa.airline.application.port.FlightRepository;
import ru.ranepa.airline.application.port.PassengerRepository;
import ru.ranepa.airline.application.port.TicketRepository;
import ru.ranepa.airline.infrastructure.ConsoleMenu;
import ru.ranepa.airline.infrastructure.InMemoryFlightRepository;
import ru.ranepa.airline.infrastructure.InMemoryPassengerRepository;
import ru.ranepa.airline.infrastructure.InMemoryTicketRepository;

public class Main {
    public static void main(String[] args) {
        FlightRepository flightRepository = new InMemoryFlightRepository();
        PassengerRepository passengerRepository = new InMemoryPassengerRepository();
        TicketRepository ticketRepository = new InMemoryTicketRepository();

        FlightService flightService = new FlightService(flightRepository);
        PassengerService passengerService = new PassengerService(passengerRepository);
        TicketService ticketService = new TicketService(
                ticketRepository, flightRepository, passengerRepository);

        Scanner scanner = new Scanner(System.in);
        ConsoleMenu menu = new ConsoleMenu(scanner, flightService, passengerService, ticketService);
        menu.run();
        scanner.close();
    }
}
