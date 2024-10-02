package Warehouse;

import Inventory.Inventory;
import Address.Address;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    List<Inventory> inventories;
    Address address;

    public Warehouse(Address address) {
        this.inventories = new ArrayList<Inventory>();
        this.address = address;
    }

    public void addInventory(Inventory inventory) {
        inventories.add(inventory);
    }

    public Inventory getInventory() {
        if(!inventories.isEmpty()) {
            return inventories.getFirst();
        }
        return null;
    }

}
