package hotel_labs.lr3_1.service;

import hotel_labs.lr3_1.model.Order;
import hotel_labs.lr3_1.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    public void addOrder(Order order) {
        orderRepository.save(order);
    }

    public void deleteOrder(String id) {
        orderRepository.deleteById(id);
    }

    public void updateOrder(Order order) {
        orderRepository.save(order);
    }
}
