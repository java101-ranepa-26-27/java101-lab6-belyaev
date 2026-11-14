package ru.ranepa.airline.domain;

public abstract class Ticket {
    private Flight flight;
    private Passenger passenger;
    private double price;

    public Ticket(Flight flight, Passenger passenger, double price) {
        this.flight = flight;
        this.passenger = passenger;
        this.price = price;
    }

    public Flight getFlight() {
        return flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getDescription();
}
