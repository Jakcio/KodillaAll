package com.kodilla.good.patterns.challenges.service.food2door;

public class OrderedProduct {

    String productName;
    Integer quantity;

    public OrderedProduct(String productName, Integer quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
