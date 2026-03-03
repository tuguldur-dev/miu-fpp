package Assignment4.Prob1;

import java.time.Month;

public class Electronics extends Product {
    private int warrantyMonth;
    private double warrantyCost;

    public Electronics(String productName, double price, int warrantyMonth, double warrantyCost) {
        if(productName == null){
            throw new IllegalArgumentException("Product name can't be empty");
        }
        this.warrantyMonth = warrantyMonth;
        this.warrantyCost = warrantyCost;
        super(productName, price);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + this.warrantyCost;
    }

    @Override
    public String toString() {
        return String.format("""
                        Product Name: %s
                        Warranty month: %d
                        Warranty cost: %f
                        Price: %.2f
                        Total: %.2f
                        """,
                this.getProductName(),
                this.warrantyMonth,
                this.warrantyCost,
                super.getPrice(),
                this.getPrice());

    }
}
