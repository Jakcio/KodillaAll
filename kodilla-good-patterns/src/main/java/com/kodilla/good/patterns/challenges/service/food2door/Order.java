package com.kodilla.good.patterns.challenges.service.food2door;

public interface Order {

    boolean getInfo(Product product);
    boolean orderProcess(Supplier supplier);
    boolean orderStatus(Supplier supplier, Product product);

}
