package com.kodilla.good.patterns.challenges.service.food2door;

import java.util.HashSet;
import java.util.Set;

public class GlutenFreeShop implements Supplier {

    OrderedProduct orderedProduct1 = new OrderedProduct("ryż", 30);
    OrderedProduct orderedProduct2 = new OrderedProduct("ziemniaki", 10);
    OrderedProduct orderedProduct3 = new OrderedProduct("soja", 15);
    OrderedProduct orderedProduct4 = new OrderedProduct("orzechy", 14);

    Set<OrderedProduct> stock = new HashSet<>();


    public GlutenFreeShop(){
        stock.add(orderedProduct1);
        stock.add(orderedProduct2);
        stock.add(orderedProduct3);
        stock.add(orderedProduct4);
    }



    @Override
    public void process(String productName, int quantity) {
        for(OrderedProduct stock1: stock) {

        if(stock1.getProductName().contains(productName)) {

            Integer stockQuantity = stock1.getQuantity();

            if(stockQuantity >= quantity) {
                System.out.println("Realizuje zamownienie produktu " + productName + " ilosc "+ quantity + " A dostępnych jest: " + stockQuantity);
            } else  {
                System.out.println("Nie moge zamowic " + productName + " Poniewaz na stanie mam tylko " + stockQuantity );
            }

        }
    }


}
}
