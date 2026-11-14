package ru.ranepa.airline.domain;

public class Flight {
    private String number;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int freeSeats;

    public Flight(String number, String origin, String destination, String departureTime, int capacity, int freeSeats) {
        this.number = number;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.capacity = capacity;
        this.freeSeats = freeSeats;
    }

    public String getNumber() {
        return number;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFreeSeats() {
        return freeSeats;
    }
}
