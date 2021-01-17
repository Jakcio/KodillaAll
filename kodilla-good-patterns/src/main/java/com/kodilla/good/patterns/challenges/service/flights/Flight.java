package com.kodilla.good.patterns.challenges.service.flights;

import java.time.LocalTime;

public class Flight {

    private final String departureAirport;
    private final String arrivalAirport;
    private LocalTime departureTime;
    private LocalTime arrivalTime;

    public Flight(String departureAirport, String arrivalAirport, LocalTime departureTime, LocalTime arrivalTime) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public String toString() {
        return "Flight: " + "from " + departureAirport + " to " + arrivalAirport ;
    }

}
