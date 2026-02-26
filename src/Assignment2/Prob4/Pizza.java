package Assignment2.Prob4;

public class Pizza {
    private PizzaSize pizzaSize;
    private PizzaType pizzaType;
    private int quantity;
    private double price;

    private void calculatePrice() {
        double sizePrice = switch (pizzaSize) {
            case PizzaSize.SMALL -> 8;
            case PizzaSize.MEDIUM -> 10;
            case PizzaSize.LARGE -> 12;
        };

        double typePrice = switch (pizzaType) {
            case PizzaType.VEGGIE -> 1;
            case PizzaType.PEPPERONI -> 2;
            case PizzaType.CHEEZE -> 1.5;
            case PizzaType.BBQ_CHICKEN -> 2;
        };
        price = (sizePrice + typePrice) * quantity;
    }

    public String printOrderSummary() {
        this.calculatePrice();
        double tax = price * 0.03;
        return String.format("""
                Pizza Order:
                Size: %s
                Type: %s
                Qty: %d
                Price: $%.2f
                Tax: $%.2f
                Total Price: $%.2f
                """, pizzaSize, pizzaType, quantity, price, tax, price + tax);
    }

    public Pizza(PizzaSize pizzaSize, PizzaType pizzaType, int quantity) {
        this.pizzaSize = pizzaSize;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
    }
}
