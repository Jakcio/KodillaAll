package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDateTime;

public class ProductOrderService{

    User user;
    Item item;

    public ProductOrderService(User user, Item item) {
        this.user = user;
        this.item = item;
    }

    public boolean order(final User user, final Item item, LocalDateTime orderTime){
        System.out.println("Ordered " + +item.getQuantity() + " " + item.getName() + ".  " + orderTime.toString());

        return true;
    }


}
