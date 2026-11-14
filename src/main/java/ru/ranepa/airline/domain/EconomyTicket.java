package ru.ranepa.airline.domain;

public class EconomyTicket extends Ticket {
    private double handLuggageAllowance;

    public EconomyTicket(Flight flight, Passenger passenger, double price,
                         double handLuggageAllowance) {
        super(flight, passenger, price);
        this.handLuggageAllowance = handLuggageAllowance;
    }

    public double getHandLuggageAllowance() {
        return handLuggageAllowance;
    }

    @Override
    public String getDescription() {
        // TODO
        return null;
    }
}
