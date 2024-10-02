package Product;

import java.util.ArrayList;
import java.util.List;

public class ProductCategory {
    public int categoryId;
    public double price;
    public List<Product> products;
    public String categoryName;

    public ProductCategory(int categoryId, double price, String categoryName) {
        this.categoryId = categoryId;
        this.price = price;
        this.categoryName = categoryName;
        this.products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct() {
       if(!products.isEmpty())
        products.removeLast();
    }
}
