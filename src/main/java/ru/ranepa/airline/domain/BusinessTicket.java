package ru.ranepa.airline.domain;

public class BusinessTicket extends Ticket {
    private String meal;
    private double baggageAllowance;

    public BusinessTicket(Flight flight, Passenger passenger, double price,
                          String meal, double baggageAllowance) {
        super(flight, passenger, price);
        this.meal = meal;
        this.baggageAllowance = baggageAllowance;
    }

    public String getMeal() {
        return meal;
    }

    public double getBaggageAllowance() {
        return baggageAllowance;
    }

    @Override
    public String getDescription() {
        // TODO
        return null;
    }
}
