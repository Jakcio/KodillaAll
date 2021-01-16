package com.kodilla.good.patterns.challenges.service.food2door;

public class ExtraFoodShopOrder implements Order{

    Supplier supplier;


    @Override
    public boolean getInfo(Product product) {
        System.out.println("Extra Food Shop new order: " );
        return true;
    }

    @Override
    public boolean orderProcess(Supplier supplier) {
        System.out.println("Extra Food Shop: order is ready");
        return true;
    }

    @Override
    public boolean orderStatus(Supplier supplier, Product product) {
        System.out.println("Extra Food Shop: order delivered!");
        return true;
    }
}
