package com.kodilla.good.patterns.challenges.service.food2door;

public class Application {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderService makeOrder = new OrderService(orderRequestRetriever.glutenFreeShopOrder);
        makeOrder.process(orderRequest);
    }

}
