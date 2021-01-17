package com.kodilla.good.patterns.challenges.service.flights;

public class Application {

    public static void main(String[] args) {

        Repository repository = new Repository();

        FlightFinder flightFinder = new FlightFinder(repository);

        flightFinder.fromFinder("Barcelona");
        flightFinder.whereFinder("Poznań");
        flightFinder.fromFinder("Lyon");

        flightFinder.viaFinder("Gdańsk", "Wrocław", "Kraków");
    }


}
