package lesson6;

public class SwitchForObjects {
    static void main() {
        Employee employee = new Executive("Dorj", 100, 2024, 2, 1, 100);
        new SwitchForObjects(employee);
    }
    public SwitchForObjects(Employee employee) {
        switch (employee) {
            case Executive e -> System.out.println("This is executive has " + e.getCompanyShare() + " company share");
            case Manager m -> System.out.println("This is manager");
            case null -> System.out.println("Illegal input");
            default -> System.out.println("Ordinary employee");
        }
    }
}
