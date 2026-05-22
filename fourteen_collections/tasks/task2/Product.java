package fourteen_collections.tasks.task2;

import java.util.ArrayList;


public class Product {
    String name;
    int price;
    int quantity = 1;

    ArrayList<Product> products = new ArrayList<>();

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
    }

    public void addProduct(Product product) {
        if (!products.contains(product)) {
            products.add(product);
        } else {
            product.quantity += 1;
        }
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void totalPrice() {
        int totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.price * product.quantity;
        }
        System.out.println("Total price is " + totalPrice);
    }

    public Product printMostExpensiveProduct() {
        int mostExpensiveProduct = 0;
        for (Product product : products) {
            if (product.price > mostExpensiveProduct) {
                mostExpensiveProduct = product.price;
            }
        }
        return products.get(mostExpensiveProduct);
    }

    public Product findProductByName(String name) {
        for (Product product : products) {
            if (product.name.equals(name)) {
                return product;
            }
        }
        return null;
    }

    public void calculateDiscountOverTenThousand() {
        for (Product product : products) {
            if (product.price > 10000) {
                product.price = (int) Math.round(product.price / 0.15);
            }
        }
    }
}