package service;

import model.Order;
import model.OrderStatus;
import repository.OrderRepository;

public class OrderService {

    private OrderRepository repository;
    private PaymentService paymentService;

    public OrderService(OrderRepository repository, PaymentService paymentService) {
        this.repository = repository;
        this.paymentService = paymentService;
    }

    public void placeOrder(Order order) {
        repository.save(order);
        paymentService.processPayment(order.getTotalAmount());
        order.setStatus(OrderStatus.PAID);
    }
}
