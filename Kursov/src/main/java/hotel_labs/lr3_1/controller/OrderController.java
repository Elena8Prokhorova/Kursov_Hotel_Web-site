package hotel_labs.lr3_1.controller;

import hotel_labs.lr3_1.model.Order;
import hotel_labs.lr3_1.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    private final OrderService orderService;
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/getOrders")
    public List<Order> get() {
        return orderService.getOrders();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/addOrder")
    public Order addFood(@RequestBody Order order) {
        System.out.println("control is ok");
        orderService.addOrder(order);
        return order;
    }

    @DeleteMapping("/deleteOrder")
    public void deleteOrder(String id) {
        orderService.deleteOrder(id);
    }

    @PutMapping("/updateOrder")
    public Order updateOrder(@RequestBody Order order) {
        orderService.updateOrder(order);
        return order;
    }
}
