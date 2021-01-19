package com.kodilla.good.patterns.challenges.service.food2door;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {
        Supplier extraFoodShop = new ExtraFoodShop();
        Map<Product, Integer> cart = new HashMap<>();
        cart.put(new Product("Maslo", new BigDecimal(20), extraFoodShop), 100);
        Consumer consumer = new Consumer("Warszawa", 1123, "Topolowa", 58, 504292315, "maormf@gmail.com");

        OrderRequest orderRequest = new OrderRequest(cart, consumer);

        OrderService orderService = new OrderService();

        orderService.realisationOrder(orderRequest);



        Supplier healthyFoodShop = new HealthyFoodShop();
        Map<Product, Integer> cart1 = new HashMap<>();
        cart1.put(new Product("Pomidory", new BigDecimal(20), healthyFoodShop), 15);
        Consumer consumer1 = new Consumer("Warszawa", 1123, "Topolowa", 58, 504292315, "maormf@gmail.com");

        OrderRequest orderRequest1 = new OrderRequest(cart1, consumer1);

        OrderService orderService1 = new OrderService();

        orderService1.realisationOrder(orderRequest1);


        Supplier glutenFreeShop = new GlutenFreeShop();
        Map<Product, Integer> cart2 = new HashMap<>();
        cart2.put(new Product("ryż", new BigDecimal(20), glutenFreeShop), 15);
        Consumer consumer2 = new Consumer("Warszawa", 1123, "Topolowa", 58, 504292315, "maormf@gmail.com");

        OrderRequest orderRequest2 = new OrderRequest(cart2, consumer2);

        OrderService orderService2 = new OrderService();

        orderService2.realisationOrder(orderRequest2);


    }

}
