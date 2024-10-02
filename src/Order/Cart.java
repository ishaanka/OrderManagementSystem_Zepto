package Order;

import java.util.HashMap;

public class Cart {
    HashMap<Integer, Integer> productVsQuantity;

    public Cart() {
        productVsQuantity = new HashMap<>();
    }

    public void addItem(int categoryId) {
        if(productVsQuantity.containsKey(categoryId)) {
            productVsQuantity.put(categoryId, productVsQuantity.get(categoryId) + 1);
        } else {
            productVsQuantity.put(categoryId, 1);
        }
    }

    public void removeItem(int categoryId) {
        if(productVsQuantity.containsKey(categoryId)) {
            productVsQuantity.put(categoryId, productVsQuantity.get(categoryId) - 1);
        } else {
            System.out.println("Item not present!");
        }
        if(productVsQuantity.get(categoryId)<=0)
             productVsQuantity.remove(categoryId);
    }
}
