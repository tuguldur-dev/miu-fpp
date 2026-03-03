package Assignment4.Prob1;

import org.testng.util.Strings;

public class Clothing extends Product {
    private String brand;
    private double discount;

    public Clothing(String productName, double price, String brand, double discount) {
        if(productName == null){
            throw new IllegalArgumentException("Product name can't be empty");
        }
        this.brand = brand;
        this.discount = discount;
        super(productName, price);
    }

    @Override
    public double getPrice() {
        return (super.getPrice() * (100 - discount)) / 100;
    }

    @Override
    public String toString() {
        return String.format("""
                        Product Name: %s
                        Product Brand: %s
                        Discount: %f
                        Price: %.2f
                        Total: %.2f
                        """,
                super.getProductName(),
                this.brand,
                this.discount,
                super.getPrice(),
                this.getPrice());

    }
}
