package com.kodilla.good.patterns.challenges.service.food2door;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {
        Supplier extraFoodShop = new ExtraFoodShop();
        Map<Product, Integer> cart = new HashMap<>();
        cart.put(new Product("Maslo", new BigDecimal(20), "cos", extraFoodShop), 100);
        Consumer consumer = new Consumer("Warszawa", 1123, "Topolowa", 58, 504292315, "maormf@gmail.com");

        OrderRequest orderRequest = new OrderRequest(cart, consumer);

        OrderService orderService = new OrderService();

        orderService.realisationOrder(orderRequest);


    }

}
