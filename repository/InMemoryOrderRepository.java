package repository;

import model.Order;
import java.util.HashMap;
import java.util.Map;

public class InMemoryOrderRepository implements OrderRepository {

    private Map<String, Order> db = new HashMap<>();

    public void save(Order order) {
        db.put(order.getOrderId(), order);
    }

    public Order findById(String id) {
        return db.get(id);
    }
}
