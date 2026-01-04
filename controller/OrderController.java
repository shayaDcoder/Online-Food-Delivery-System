package controller;

import model.Order;
import service.OrderService;

public class OrderController {

    private OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    public void createOrder(Order order) {
        service.placeOrder(order);
    }
}
