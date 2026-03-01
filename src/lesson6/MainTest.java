package lesson6;

public class MainTest {
    static void main() {
        Object[] stuff = {"Java", 10.11, 12, 13.0, 23.3, "Hi"};

        double sum = 0.0;

        for (int i = 0; i < stuff.length; i++) {
            if (stuff[i] instanceof Number) {
                System.out.println(stuff[i]);
                Double next = Double.valueOf(String.valueOf(stuff[i]));
                sum += next;
            }
        }

        System.out.println("Sum:" + sum);

        sum = 0.0;

        for (int i = 0; i < stuff.length; i++) {
            if (stuff[i] instanceof Number next) {
                System.out.println(stuff[i]);
                sum += next.doubleValue();
            }
        }


        System.out.println("Sum:" + sum);
    }

    static Employee findMaxEmployee(Employee[] employees) {
        if (employees == null || employees.length == 0) {
            return null;
        }
        Employee maxSalary = employees[0];

        for (Employee each : employees) {
            if (maxSalary.getSalary() < each.getSalary()) {
                maxSalary = each;
            }
        }
        return maxSalary;
    }
}
