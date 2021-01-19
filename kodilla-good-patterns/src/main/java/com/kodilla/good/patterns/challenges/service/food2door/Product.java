package com.kodilla.good.patterns.challenges.service.food2door;

import java.math.BigDecimal;

public class Product {

    private String name;
    private BigDecimal price;
    private String comments;
    private Supplier supplier;

    public Product(String name, BigDecimal price, String comments, Supplier supplier) {
        this.name = name;
        this.price = price;
        this.comments = comments;
        this.supplier = supplier;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }


    public String getComments() {
        return comments;
    }

    public Supplier getSupplier() {
        return supplier;
    }
}
