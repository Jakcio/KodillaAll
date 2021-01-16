package com.kodilla.good.patterns.challenges.service.food2door;

public class OrderService {
    private final Order order;

    public OrderService(Order order) {
        this.order = order;
    }

    public OrderDto process(final OrderRequest orderRequest) {

        boolean isOrdered = order.getInfo(orderRequest.getProduct());

        if(isOrdered) {
            order.orderProcess(orderRequest.getSupplier());
            order.orderStatus(orderRequest.getSupplier(), orderRequest.getProduct());
            System.out.println("Supplier name: "+ orderRequest.getSupplier().getSupplierName() + "\nSupplier phone numer: " +
                    orderRequest.getSupplier().getSupplierPhoneNumber() + "\n" + "Supplier mail: " +
                    orderRequest.getSupplier().getSupplierMail() + "\n");


            return new OrderDto(orderRequest.getConsumer(), orderRequest.getProduct(), orderRequest.getSupplier());

        } else {

            return new OrderDto(orderRequest.getConsumer(), orderRequest.getProduct(), orderRequest.getSupplier());
        }


    }

}
