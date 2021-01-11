package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDateTime;

public class OrderRepository implements Repository{

    Item item;
    User user;

    public OrderRepository(Item item, User user) {
        this.item = item;
        this.user = user;
    }

    @Override
    public boolean create(Item item, User user, LocalDateTime orderTime) {
        System.out.println("Order: " + item.getName() + " - has been finished and saved in repository at:  " + orderTime);
        return true;
    }


}
