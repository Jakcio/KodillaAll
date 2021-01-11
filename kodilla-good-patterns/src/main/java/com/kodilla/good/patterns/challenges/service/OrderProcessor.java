package com.kodilla.good.patterns.challenges.service;

public class OrderProcessor {

    private MailService mailService;
    private ProductOrderService productOrderService;
    private Repository repository;

    public OrderProcessor(final MailService mailService, final ProductOrderService productOrderService, final Repository repository) {
        this.mailService = mailService;
        this.productOrderService = productOrderService;
        this.repository = repository;
    }

    public OrderDto orderProcess(final OrderRequest orderRequest) {
        boolean isRented = productOrderService.order(orderRequest.getUser(), orderRequest.getItem(), orderRequest.getOrderTime());
        if(isRented) {
            mailService.sendEmail(orderRequest.getUser());
            repository.create(orderRequest.getItem(), orderRequest.getUser(), orderRequest.getOrderTime());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }


    }

}
