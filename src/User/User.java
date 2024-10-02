package User;

import java.util.ArrayList;
import java.util.List;

import Order.Order;
import Order.Cart;

public class User {
    int id;
    String userName;
    List<Order> ordersList;
    Cart cart;

    public User(int id, String userName) {
       this.id = id;
       this.userName = userName;
       ordersList = new ArrayList<Order>();
       this.cart = new Cart();
    }

    public Cart getCart() {
        return cart;
    }

    public void addOrder(Order order) {
        ordersList.add(order);
    }
}
