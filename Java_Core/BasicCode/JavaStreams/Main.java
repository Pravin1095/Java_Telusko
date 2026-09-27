package Java_Core.BasicCode.JavaStreams;

import java.util.List;

public class Main {
    public static void main(String[] args){

        OrderService orderservice = new OrderService();
        List<Order> orders = List.of(
                new Order("ORD-001", "REGULAR", 150.00, true),
                new Order("ORD-002", "VIP", 450.50, true),
                new Order("ORD-003", "VIP", 1200.00, false), // Unfulfilled VIP order
                new Order("ORD-004", "VIP", 899.99, true),   // Fulfilled VIP order
                new Order("ORD-005", "PREMIUM", 2500.00, true)
        );

        orderservice.getTopVipOrderAmount(orders);
    }
}
