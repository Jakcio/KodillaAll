package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("john", "John", "Wekl");
        Item item = new Item("Ball", 2, 20.7);

        LocalDateTime orderTime = LocalDateTime.of(2021, 1, 9, 12, 0);

        return new OrderRequest(user, item, orderTime);

    }

}
