package com.kodilla.good.patterns.challenges.service.food2door;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Supplier {


    private Map<String, Integer> stock = new HashMap<>();

    public ExtraFoodShop() {
        stock.put("Maslo", 10);
        stock.put("Chleb", 15);
        stock.put("Woda", 20);
        stock.put("Ser", 30);
    }

    @Override
    public void process(String productName, int quantity) {
        if(stock.containsKey(productName)) {
            Integer stockQuantity = stock.get(productName);
            if(stockQuantity >= quantity) {
                System.out.println("Realizuje zamowienie produktu " + productName + " ilosci " + quantity + " A dostepnych jest: " + stockQuantity);

                stock.put(productName, stockQuantity-quantity);
            } else {
                System.out.println("Nie moge zamowic " + productName + " Poniewaz na stanie mam tylko: " + stockQuantity);
            }
        }


    }



}
