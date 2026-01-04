package repository;

import model.Order;

public interface OrderRepository {
    void save(Order order);
    Order findById(String orderId);
}
