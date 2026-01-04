package main;

import model.*;
import payment.*;
import repository.*;
import service.*;
import controller.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        User user = new User("Yogita", "Pune");

        MenuItem pizza = new MenuItem("Pizza", 250);
        MenuItem burger = new MenuItem("Burger", 150);

        Restaurant restaurant = new Restaurant(
                "Food Plaza",
                List.of(pizza, burger)
        );

        Order order = new Order(
                user,
                restaurant,
                List.of(pizza, burger)
        );

        OrderRepository repository = new InMemoryOrderRepository();
        PaymentService paymentService = new PaymentService(new UPIPayment());
        OrderService orderService = new OrderService(repository, paymentService);
        OrderController controller = new OrderController(orderService);

        controller.createOrder(order);

        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Order Status: " + order.getStatus());
    }
}
