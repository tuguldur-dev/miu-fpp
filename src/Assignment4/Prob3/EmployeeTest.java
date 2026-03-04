package Assignment4.Prob3;

import java.util.Arrays;

public class EmployeeTest {
    static void main() {
        Employee[] employees = new Employee[]{
                new SalariedEmployee("Salary1", "Employee1", "#001", 200),
                new HourlyEmployee("Hourly1", "Employee2", "#002", 10, 8),
                new CommissionEmployee("Commission1", "Employee3", "#003", 10, 10),
                new BasePlusCommissionEmployee("BasePlus1", "Employee4", "#004", 12, 10, 4000),
                new BasePlusCommissionEmployee("BasePlus2", "Employee5", "#005", 20, 14, 5000)
        };

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        employees = findSalaryList(employees, 4200);
        System.out.println("####Filtered employees###\n");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static Employee[] findSalaryList(Employee[] col, double salary) {
        if (col == null) {
            return new Employee[0];
        }

        Employee[] employees = new Employee[col.length];
        int counter = 0;

        for (Employee employee : col) {
            if (employee != null && employee.getPayment() < salary) {
                employees[counter++] = employee;
            }
        }
        return Arrays.copyOf(employees, counter);
    }
}
