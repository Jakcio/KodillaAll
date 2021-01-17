package com.kodilla.good.patterns.challenges.service.flights;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    private final List<Flight> flightList = new ArrayList<>();

    public Repository() {
        flightList.add(new Flight("Gdańsk", "Kraków"));
        flightList.add(new Flight("Kraków", "Wrocław"));
        flightList.add(new Flight("Monachium", "Gdańsk"));
        flightList.add(new Flight("Gdańsk", "Mediolan"));
        flightList.add(new Flight("Lyon", "Mediolan"));
        flightList.add(new Flight("Kopenhaga", "Poznań"));
        flightList.add(new Flight("Barcelona", "Poznań"));
        flightList.add(new Flight("Kijów", "Bukareszt"));

    }

    public List<Flight> getFlightList() {

        return new ArrayList<>(flightList);
    }

}
