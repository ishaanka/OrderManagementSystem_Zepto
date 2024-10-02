package Warehouse;

import java.util.ArrayList;
import java.util.List;

public class WarehouseController {
    List<Warehouse> warehouses;
    WarehouseSelection warehouseSelector;

    public WarehouseController(WarehouseSelection warehouseSelector) {
        warehouses = new ArrayList<Warehouse>();
        this.warehouseSelector = warehouseSelector;
    }

    public void addWarehouse(Warehouse warehouse) {
        warehouses.add(warehouse);
    }
    public void removeWarehouse(Warehouse warehouse) {
        warehouses.remove(warehouse);
    }

    public Warehouse getWarehouse() {
        return warehouseSelector.getWarehouse(warehouses);
    }
}
