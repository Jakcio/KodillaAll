package com.kodilla.good.patterns.challenges.service.food2door;

import java.util.Map;

public class OrderRequest {

    private Map<Product, Integer> cart;

    private Consumer consumer;

    public OrderRequest(Map<Product, Integer> cart, Consumer consumer) {
        this.cart = cart;
        this.consumer = consumer;
    }

    public Map<Product, Integer> getCart() {
        return cart;
    }

    public Consumer getConsumer() {
        return consumer;
    }
}



