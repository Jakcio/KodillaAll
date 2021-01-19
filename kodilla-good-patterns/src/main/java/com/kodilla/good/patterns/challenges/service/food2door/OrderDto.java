package com.kodilla.good.patterns.challenges.service.food2door;

public class OrderDto {

    private Consumer consumer;

    public OrderDto(Consumer consumer) {
        this.consumer = consumer;
    }

    public Consumer getConsumer() {
        return consumer;
    }


}
