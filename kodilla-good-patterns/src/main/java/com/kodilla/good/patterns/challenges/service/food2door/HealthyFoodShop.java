package com.kodilla.good.patterns.challenges.service.food2door;

import java.util.ArrayList;
import java.util.List;

public class HealthyFoodShop implements Supplier {
    int i=0;

    OrderedProduct orderedProduct1 = new OrderedProduct("Pomidory", 30);
    OrderedProduct orderedProduct2 = new OrderedProduct("Ogórki", 30);
    OrderedProduct orderedProduct3 = new OrderedProduct("Papryka", 30);
    OrderedProduct orderedProduct4 = new OrderedProduct("Jajka", 30);

    private List<OrderedProduct> stock = new ArrayList<>();

    public HealthyFoodShop(){
        stock.add(orderedProduct1);
        stock.add(orderedProduct2);
        stock.add(orderedProduct3);
        stock.add(orderedProduct4);
    }

    @Override
    public void process(String productName, int quantity) {
        for (int i = 0; i < stock.size(); i++) {
            if (stock.get(i).getProductName().equals(productName)) {
                {
                    Integer stockQuantity = stock.get(i).getQuantity();
                    if (stockQuantity >= quantity) {
                        System.out.println("Realizuje zamowienie produktu " + productName + " ilosc " + quantity + " A dostepnych jest: " + stockQuantity);
                    } else {
                        System.out.println("Nie mogę zamówić " + productName + " Ponieważ na stanie mam tylko: " + stockQuantity);
                    }
                }


            }

        }
    }
}
