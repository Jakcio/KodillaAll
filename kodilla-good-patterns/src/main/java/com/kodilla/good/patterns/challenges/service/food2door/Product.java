package com.kodilla.good.patterns.challenges.service.food2door;

public class Product {

    String name;
    double price;
    double quantity;
    String comments;

    public Product(String name, double price, double quantity, String comments) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.comments = comments;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getComments() {
        return comments;
    }
}
