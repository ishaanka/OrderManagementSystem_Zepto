package Order;

import Inventory.Inventory;
import Payment.IPayment;
import Payment.Invoice;
import User.User;

import java.util.Map;

public class Order {
    User user;
    Inventory inventory;
    Invoice invoice;
    IPayment paymentMethod;

    public Order(User user, Inventory inventory, IPayment payment) {
        this.user = user;
        this.inventory = inventory;
        this.paymentMethod = payment;
    }

    public void generateOrder() {
       this.invoice = generateInvoice();
       this.invoice.printInvoice();
       this.paymentMethod.pay();
    }

    private Invoice generateInvoice() {
        double amount = 0.0;
        for(Map.Entry<Integer,Integer> entry: user.getCart().productVsQuantity.entrySet()) {
            amount+= inventory.getPrice(entry.getKey());
        }
        return new Invoice(amount);
    }
}
