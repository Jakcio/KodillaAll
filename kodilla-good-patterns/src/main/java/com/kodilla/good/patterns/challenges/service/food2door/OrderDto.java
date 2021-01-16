package com.kodilla.good.patterns.challenges.service.food2door;

public class OrderDto {

    Consumer consumer;
    Product product;
    Supplier supplier;

    public OrderDto(Consumer consumer, Product product, Supplier supplier) {
        this.consumer = consumer;
        this.product = product;
        this.supplier = supplier;

    }

    public Consumer getConsumer() {
        return consumer;
    }

    public void getProductName() {
        product.getName();
    }

    public void getProductPrice() {
        product.getPrice();
    }

    public void getProductQuantity() {
        product.getQuantity();
    }



}
