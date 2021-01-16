package com.kodilla.good.patterns.challenges.service.food2door;

public class HealthyFoodShopMakeOrder implements Order{

    Supplier supplier;

    public Supplier getSupplier() {
        return supplier;
    }

    @Override
    public boolean getInfo(Product product) {
        System.out.println("Gluten Free Shop new order: ");
        return true;
    }

    @Override
    public boolean orderProcess(Supplier supplier) {
        System.out.println("Gluten Free Shop: order is ready");
        return true;
    }

    @Override
    public boolean orderStatus(Supplier supplier, Product product) {
        System.out.println("Gluten Free Shop: order delivered!");
        return true;
    }
}
