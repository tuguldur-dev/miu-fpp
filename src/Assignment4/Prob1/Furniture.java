package Assignment4.Prob1;

public class Furniture extends Product {

    private Material material;
    private double shippingCost;

    public Furniture(String productName, double price, Material material, double shippingCost) {
        super(productName, price);
        this.material = material;
        this.shippingCost = shippingCost;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + shippingCost;
    }

    @Override
    public String toString() {
        return String.format("""
                        Product Name: %s
                        Material: %s
                        Shipping cost: %s
                        Price: %.2f
                        Total: %.2f
                        """,
                super.getProductName(),
                this.material,
                this.shippingCost,
                super.getPrice(),
                this.getPrice());

    }
}
