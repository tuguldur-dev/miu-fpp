package Assignment4.Prob1;

public class Furniture extends Product {

    private Material material;
    private double shippingCost;

    public Furniture(String productName, double price, Material material, double shippingCost) {

        if(productName == null){
            throw new IllegalArgumentException("Product name can't be empty");
        }

        this.shippingCost = shippingCost;
        this.material = material;
        super(productName, price);
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
                this.getProductName(),
                this.material,
                this.shippingCost,
                super.getPrice(),
                this.getPrice());

    }
}
