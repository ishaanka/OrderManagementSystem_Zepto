package Order;

import java.util.ArrayList;
import java.util.List;

public class OrderController {
    List<Order> orderList;

    public OrderController() {
        orderList = new ArrayList<Order>();
    }

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public void removeOrder(Order order) {
        orderList.remove(order);
    }
}
