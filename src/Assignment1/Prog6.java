package Assignment1;

import java.util.Scanner;

public class Prog6 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("Enter user type (R/C/I):");
            String userType = scanner.next();
            double unitPrice = switch (userType) {
                case "r", "R" -> 0.12;
                case "c", "C" -> 0.20;
                case "i", "I" -> 0.35;
                case null, default -> {
                    System.out.print("Invalid code");
                    yield 0.00;
                }
            };

            System.out.print("\nEnter units consumed:");
            int unit = scanner.nextInt();
            double billAmount = unit * unitPrice;
            System.out.println("\n=== Electricity Bill ===");
            System.out.printf("User Type: %s\n", userType);
            System.out.printf("Units: %d\n", unit);
            System.out.printf("Bill Amount: $%.2f\n", billAmount);

            System.out.println("Do you want to calculate another bill? (y/n)");
            input = scanner.next();
            if (input.equalsIgnoreCase("n")) {
                System.out.println("Goodbye! Thanks for using the Electricity Bill Generator.");
                break;
            }
        } while (input.equalsIgnoreCase("y"));

    }
}
