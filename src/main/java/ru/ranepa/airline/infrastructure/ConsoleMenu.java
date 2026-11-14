package ru.ranepa.airline.infrastructure;

import java.util.Scanner;
import ru.ranepa.airline.application.FlightService;
import ru.ranepa.airline.application.PassengerService;
import ru.ranepa.airline.application.TicketService;

public class ConsoleMenu {
    private Scanner scanner;
    private FlightService flightService;
    private PassengerService passengerService;
    private TicketService ticketService;

    public ConsoleMenu(Scanner scanner, FlightService flightService,
                       PassengerService passengerService, TicketService ticketService) {
        this.scanner = scanner;
        this.flightService = flightService;
        this.passengerService = passengerService;
        this.ticketService = ticketService;
    }

    public void run() {
        System.out.println("Добро пожаловать в авиакассу!");
        while (true) {
            System.out.println("\n=== Авиакасса ===");
            System.out.println("1. Добавить рейс");
            System.out.println("2. Добавить пассажира");
            System.out.println("3. Показать рейсы, пассажиров и билеты");
            System.out.println("4. Найти рейсы по направлению");
            System.out.println("5. Продажа и возврат билетов");
            System.out.println("6. Статистика рейса");
            System.out.println("0. Выход");

            if (!scanner.hasNextLine()) {
                return;
            }
            String command = readText("Выберите пункт: ");
            try {
                switch (command) {
                    case "1":
                        addFlight();
                        break;
                    case "2":
                        addPassenger();
                        break;
                    case "3":
                        flightService.getAllFlights();
                        passengerService.getAllPassengers();
                        ticketService.getAllTickets();
                        flightService.getAvailableFlights();
                        showPlaceholder();
                        break;
                    case "4":
                        flightService.findByDirection(readText("Куда: "));
                        showPlaceholder();
                        break;
                    case "5":
                        showTicketMenu();
                        break;
                    case "6":
                        showStatistics();
                        break;
                    case "0":
                        System.out.println("Программа завершена.");
                        return;
                    default:
                        System.out.println("Нет такого пункта. Введите номер из меню.");
                }
            } catch (NumberFormatException exception) {
                System.out.println("Некорректное число. Возврат в главное меню.");
            }
        }
    }

    private void addFlight() {
        String number = readText("Номер рейса: ");
        String origin = readText("Откуда: ");
        String destination = readText("Куда: ");
        String departureTime = readText("Время вылета (например, 20.12.2026 14:30): ");
        int capacity = Integer.parseInt(readText("Всего мест: "));
        flightService.addFlight(number, origin, destination, departureTime, capacity);
        showPlaceholder();
    }

    private void addPassenger() {
        String name = readText("Имя пассажира: ");
        String passportNumber = readText("Номер паспорта: ");
        String phone = readText("Телефон: ");
        passengerService.addPassenger(name, passportNumber, phone);
        showPlaceholder();
    }

    private void showTicketMenu() {
        System.out.println("\n1. Продать билет эконом-класса");
        System.out.println("2. Продать билет бизнес-класса");
        System.out.println("3. Вернуть билет");
        System.out.println("0. Назад");
        String command = readText("Выберите действие: ");
        switch (command) {
            case "1":
                sellEconomyTicket();
                break;
            case "2":
                sellBusinessTicket();
                break;
            case "3":
                String flightNumber = readText("Номер рейса: ");
                String passportNumber = readText("Номер паспорта: ");
                ticketService.returnTicket(flightNumber, passportNumber);
                showPlaceholder();
                break;
            case "0":
                return;
            default:
                System.out.println("Нет такого пункта.");
        }
    }

    private void sellEconomyTicket() {
        String flightNumber = readText("Номер рейса: ");
        String passportNumber = readText("Номер паспорта: ");
        double price = readNumber("Цена билета: ");
        double handLuggageAllowance = readNumber("Норма ручной клади (кг): ");
        ticketService.sellEconomyTicket(flightNumber, passportNumber, price, handLuggageAllowance);
        showPlaceholder();
    }

    private void sellBusinessTicket() {
        String flightNumber = readText("Номер рейса: ");
        String passportNumber = readText("Номер паспорта: ");
        double price = readNumber("Цена билета: ");
        String meal = readText("Питание: ");
        double baggageAllowance = readNumber("Норма багажа (кг): ");
        ticketService.sellBusinessTicket(flightNumber, passportNumber, price, meal, baggageAllowance);
        showPlaceholder();
    }

    private void showStatistics() {
        String flightNumber = readText("Номер рейса: ");
        ticketService.getRevenue(flightNumber);
        flightService.getLoadFactor(flightNumber);
        flightService.getFreeSeats(flightNumber);
        showPlaceholder();
    }

    private String readText(String prompt) {
        System.out.print(prompt);
        if (!scanner.hasNextLine()) {
            return "";
        }
        return scanner.nextLine().trim();
    }

    private double readNumber(String prompt) {
        return Double.parseDouble(readText(prompt).replace(',', '.'));
    }

    private void showPlaceholder() {
        System.out.println("Команда вызвана. Функция пока не реализована.");
    }
}
