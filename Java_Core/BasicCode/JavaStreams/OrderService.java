package Java_Core.BasicCode.JavaStreams;

import java.util.*;

public class OrderService {
    List<Order> orders = new ArrayList<>(); //List is a interface and ArrayList implements List

    public double getTopVipOrderAmount(List<Order> orders){
        double result = orders.stream()
                .filter(o -> o.isFulfilled() && "VIP".equals(o.getCustomerCategory()))
                .mapToDouble(Order::getTotalAmount)
                .max()
                .orElse(0.0);
        return result;
    }

}