package Inventory;

import Product.Product;
import Product.ProductCategory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    public int id;
    List<ProductCategory> productCategories;

    public Inventory() {
        productCategories = new ArrayList<>();
    }

    public void addProductCategory(ProductCategory productCategory) {
        productCategories.add(productCategory);
    }

    public void removeProductCategory(ProductCategory productCategory) {
        productCategories.remove(productCategory);
    }

    public void removeProduct(int categoryId) {
       for(ProductCategory pCategory : productCategories) {
           if(pCategory.categoryId == categoryId) {
               pCategory.removeProduct();
               return;
           }
       }
    }

    public void displayProducts() {
        for(ProductCategory pCategory : productCategories) {
            System.out.println("CategoryId:"+pCategory.categoryId
                    +" categoryName:"+pCategory.categoryName
                    +" QuantityAvailable:"+pCategory.products.size()+" Price:"+pCategory.price);
        }
    }

    public double getPrice(int categoryId) {
        for(ProductCategory pCategory : productCategories) {
            if(pCategory.categoryId == categoryId) {
                return pCategory.price;
            }
        }
        return -1;
    }
}
