package Assignment4.Prob3;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }


    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    double getPayment() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return String.format("""
                        First Name: %s
                        Last Name: %s
                        SNN: %s
                        Salary: %.2f
                        """,
                this.getFirstName(),
                this.getLastName(),
                this.getSocialSecurityNumber(),
                this.getPayment());
    }
}
