package Warehouse;

import java.util.List;

public class NearestWarehouse implements WarehouseSelection{
    public Warehouse getWarehouse(List<Warehouse> warehouses) {
        return (!warehouses.isEmpty()) ? warehouses.getFirst() : null;
    }
}
