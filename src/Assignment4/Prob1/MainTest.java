package Assignment4.Prob1;

import java.time.Month;

public class MainTest {
    static void main() {
        Product[] products = new Product[]{
                new Clothing("Shoes", 100.0, "Zara", 20),
                new Electronics("IPhone", 1000.0, 12, 100),
                new Electronics("Macbook", 2000.0, 12, 100),
                new Furniture("Table", 100.0, Material.steel, 10),
                new Furniture("Cup", 5.0, Material.plastic, 1)
        };

        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("Sum of products cost: " + sumProducts(products));
    }

    public static double sumProducts(Product[] col) {
        double totalPricing = 0;
        if (col == null) {
            return totalPricing;
        }
        for (Product product : col) {
            totalPricing += product.getPrice();
        }
        return totalPricing;
    }
}
