package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private Item item;
    private LocalDateTime orderTime;


    public OrderRequest(final User user, final Item item, final LocalDateTime orderTime) {
        this.user = user;
        this.item = item;
        this.orderTime = orderTime;
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }
}
