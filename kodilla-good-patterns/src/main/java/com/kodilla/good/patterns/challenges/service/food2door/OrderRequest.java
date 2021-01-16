package com.kodilla.good.patterns.challenges.service.food2door;

public class OrderRequest {

    Supplier supplier;
    Product product;
    Consumer consumer;

    public OrderRequest(Supplier supplier, Product product, Consumer consumer) {
        this.supplier = supplier;
        this.product = product;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }
    public Consumer getConsumer() {
        return consumer;
    }
}
