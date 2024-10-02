package Zepto;

import Address.Address;
import Inventory.Inventory;
import Order.Order;
import Order.OrderController;
import Payment.CardPayment;
import Payment.IPayment;
import Product.Product;
import User.UserController;
import Warehouse.NearestWarehouse;
import Warehouse.Warehouse;
import Warehouse.WarehouseController;
import User.User;
import Product.ProductCategory;

public class App {
    OrderController orderController;
    UserController userController;
    WarehouseController warehouseController;

    public App() {
        orderController = new OrderController();
        warehouseController = new WarehouseController(new NearestWarehouse());
        userController = new UserController();

        initializeWarehouses();
    }

    public void addUser(User user) {
        userController.addUser(user);
    }

    public void initializeWarehouses() {
        Warehouse warehouse = new Warehouse(new Address("Faridabad",121006));
        warehouse.addInventory(initializeProducts());
        warehouseController.addWarehouse(warehouse);
    }

    public void driver() {
        warehouseController.getWarehouse().getInventory().displayProducts();

        User user = new User(1,"Ishaan");
        addUser(user);

        user.getCart().addItem(1);
        user.getCart().addItem(2);
        user.getCart().addItem(3);

        Order order = new Order(user, warehouseController.getWarehouse().getInventory(), new CardPayment());
        order.generateOrder();

        user.addOrder(order);
        orderController.addOrder(order);


    }

    public Inventory initializeProducts() {
        ProductCategory productCategory = new ProductCategory(1,20.00, "Chips");
        for(int i=0;i<9;i++) {
            Product product = new Product(i,"Lays");
            productCategory.addProduct(product);
        }

        ProductCategory productCategory2 = new ProductCategory(2,60.00, "SoftDrink");
        for(int i=0;i<9;i++) {
            Product product = new Product(i,"Pepsi");
            productCategory2.addProduct(product);
        }

        ProductCategory productCategory3 = new ProductCategory(3,85.00, "Chocolate");
        for(int i=0;i<9;i++) {
            Product product = new Product(i,"Cadbury");
            productCategory3.addProduct(product);
        }

        Inventory inventory = new Inventory();
        inventory.addProductCategory(productCategory);
        inventory.addProductCategory(productCategory2);
        inventory.addProductCategory(productCategory3);
        return inventory;
    }
}
