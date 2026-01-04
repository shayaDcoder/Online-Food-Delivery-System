package model;

import java.util.List;
import java.util.UUID;

public class Order {

    private String orderId;
    private User user;
    private Restaurant restaurant;
    private List<MenuItem> items;
    private double totalAmount;
    private OrderStatus status;

    public Order(User user, Restaurant restaurant, List<MenuItem> items) {
        this.orderId = UUID.randomUUID().toString();
        this.user = user;
        this.restaurant = restaurant;
        this.items = items;
        this.status = OrderStatus.CREATED;
        calculateTotal();
    }

    private void calculateTotal() {
        for (MenuItem item : items) {
            totalAmount += item.getPrice();
        }
    }

    public String getOrderId() { return orderId; }
    public double getTotalAmount() { return totalAmount; }
    public OrderStatus getStatus() { return status; }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
