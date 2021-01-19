package com.kodilla.good.patterns.challenges.service.food2door;

import java.util.Map;

public class OrderService {



    public void realisationOrder(final OrderRequest orderRequest) {

       Map<Product, Integer> cart = orderRequest.getCart() ;

        for (Map.Entry<Product, Integer> entry: cart.entrySet()
             ) {
            entry.getKey().getSupplier().process(entry.getKey().getName(), entry.getValue());

        }
    }
}








