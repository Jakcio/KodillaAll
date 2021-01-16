package com.kodilla.good.patterns.challenges.service.food2door;

public class OrderRequestRetriever {

    GlutenFreeShopOrder glutenFreeShopOrder = new GlutenFreeShopOrder();

    public OrderRequest retrieve() {
        Supplier supplier = new Supplier("Mark", 565444335, "markus@gmail.com");
        Product product = new Product("Tomato", 100, 30, " ");
        Consumer consumer = new Consumer("Warszawa", 20-222, "Topolowa", 34, 402330232, "dolante@gmail.com");
        return  new OrderRequest(supplier, product, consumer);
    }

}
