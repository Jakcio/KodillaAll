package com.kodilla.good.patterns.challenges.service.flights;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Repository {

    private final List<Flight> flightList = new ArrayList<>();

    public Repository() {
        flightList.add(new Flight("Barcelona", "Warszawa", LocalTime.of(9,30),
                LocalTime.of(13,22)));
        flightList.add(new Flight("Szczecin", "Monachium", LocalTime.of(20,30),
                LocalTime.of(23,52)));
        flightList.add(new Flight("Wiedeń", "Gdańsk", LocalTime.of(5,44),
                LocalTime.of(7,22)));
        flightList.add(new Flight("Budapeszt", "Kiszyniów", LocalTime.of(5,30),
                LocalTime.of(8,26)));
        flightList.add(new Flight("Lyon", "Mediolan", LocalTime.of(12,30),
                LocalTime.of(13,22)));
        flightList.add(new Flight("Kopenhaga", "Mińsk", LocalTime.of(15,30),
                LocalTime.of(17,52)));
        flightList.add(new Flight("Moskwa", "Poznań", LocalTime.of(20,30),
                LocalTime.of(23,12)));
        flightList.add(new Flight("Kijów", "Bukareszt", LocalTime.of(21,30),
                LocalTime.of(23,10)));

    }

    public List<Flight> getFlightList() {

        return new ArrayList<>(flightList);
    }

}
