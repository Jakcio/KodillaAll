package com.kodilla.good.patterns.challenges.service.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {
    private final Repository repository;

    public FlightFinder(Repository repository) {
        this.repository = repository;
    }

    public void fromFinder(String fromCity) {
        List<Flight> fromList;
        fromList = repository.getFlightList().stream()
                .filter(f -> f.getDepartureAirport().equals(fromCity))
                .collect(Collectors.toList());

        System.out.println("From " + fromCity + " List: " + fromList);

    }
    public void whereFinder(String whereCity) {
        List<Flight> whereList;
        whereList = repository.getFlightList().stream()
                .filter(f -> f.getArrivalAirport().equals(whereCity))
                .collect(Collectors.toList());

        System.out.println("To " + whereCity + " List: " + whereList);
    }

    public void viaFinder(String fromCity, String whereCity, String viaCity) {
        List<Flight> viaList;
        viaList = repository.getFlightList().stream()
                .filter(f -> f.getArrivalAirport().equals(viaCity))
                .collect(Collectors.toList());

        viaList.addAll(repository.getFlightList().stream()
        .filter(f -> f.getDepartureAirport().equals(viaCity))
        .collect(Collectors.toList()));


        System.out.println("From " + fromCity+ " via " + viaCity + " to " + whereCity + " List: " + viaList);
    }


}
