package lesson8;

import java.util.Objects;

public class Employee {
    Employee(String aName, int aSalary) {
        name = aName;
        salary = aSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // instance methods
    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    //instance fields
    private String name;
    private int salary;

    @Override
    public String toString() {
        return "Employee Name=" + name + ", Salary=" + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }
//    @Override
//    public boolean equals(Object employee) {
//        if (employee == null) {
//            return false;
//        }
//        if (this == employee) {
//            return true;
//        }
//        if (!(employee instanceof Employee e)) return false;
//        if (employee.getClass() != this.getClass()) {
//            return false;
//        }
//
//        return this.salary == e.salary && this.name.equals(e.name);
//    }
}