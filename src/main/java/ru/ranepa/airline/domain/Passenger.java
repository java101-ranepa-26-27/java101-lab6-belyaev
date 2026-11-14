package ru.ranepa.airline.domain;

public class Passenger {
    private String name;
    private String passportNumber;
    private String phone;

    public Passenger(String name, String passportNumber, String phone) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getPhone() {
        return phone;
    }
}
