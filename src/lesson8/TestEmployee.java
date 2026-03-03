package lesson8;

public class TestEmployee {
    static void main() {
        Employee[] employees = new Employee[]{
                new Employee("E1", 10),
                new Employee("E1", 10),
                new Employee("E3", 12)
        };

        System.out.println(employees[0].equals(null));
        System.out.println(employees[0].toString());
    }
}
