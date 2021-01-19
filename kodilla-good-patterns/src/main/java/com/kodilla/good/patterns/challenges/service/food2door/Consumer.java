package com.kodilla.good.patterns.challenges.service.food2door;

public class Consumer {

    private String city;
    private int postalCode;
    private String street;
    private int houseNumber;
    private int phoneNumber;
    private String mail;


    public Consumer(String city, int postalCode, String street, int houseNumber, int phoneNumber, String mail) {
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
        this.houseNumber = houseNumber;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
    }

}
