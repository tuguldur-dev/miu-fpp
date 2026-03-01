package lesson6;

import java.time.LocalDate;

class Employee {
    Employee(String aName, double aSalary, int aYear, int aMonth, int aDay) {
        name = aName;
        salary = aSalary;
        hireDay = LocalDate.of(aYear,aMonth,aDay);
    }
    // instance methods
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public LocalDate getHireDay() {
        return hireDay;
    }
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
    //instance fields
    private String name;
    private double salary;
    private LocalDate hireDay;
}