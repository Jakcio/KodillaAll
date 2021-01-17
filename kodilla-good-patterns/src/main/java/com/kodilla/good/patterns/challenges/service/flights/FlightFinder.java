package com.kodilla.good.patterns.challenges.service.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {
    Repository repository = new Repository();


    public List<Flight> fromFinder(String fromCity) {
        List<Flight> fromList = new ArrayList<>();
        fromList = repository.getFlightList().stream()
                .filter(f -> f.getDepartureAirport() == fromCity)
                .collect(Collectors.toList());

        System.out.println("From " + fromCity + " List: " + fromList);
        return fromList;

    }
    public List<Flight> whereFinder(String whereCity) {
        List<Flight> whereList = new ArrayList<>();
        whereList = repository.getFlightList().stream()
                .filter(f -> f.getArrivalAirport() == whereCity)
                .collect(Collectors.toList());

        System.out.println("From " + whereCity + " List: " + whereList);
        return whereList;
    }

}
