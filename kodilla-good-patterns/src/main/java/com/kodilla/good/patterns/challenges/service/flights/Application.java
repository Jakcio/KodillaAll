package com.kodilla.good.patterns.challenges.service.flights;

public class Application {

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();

        flightFinder.fromFinder("Barcelona");
        flightFinder.whereFinder("Poznań");
        flightFinder.fromFinder("Lyon");

    }


}
