package Assignment4.Prob3;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        if (firstName == null || lastName == null || socialSecurityNumber == null) {
            throw new IllegalArgumentException("Employee's basic can't be empty");
        }
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return String.format("""
                        First Name: %s
                        Last Name: %s
                        SNN: %s
                        Gross Sales: %.2f
                        Commission Rate: %.2f
                        Base salary: %.2f
                        Payment: %.2f
                        """,
                this.getFirstName(),
                this.getLastName(),
                this.getSocialSecurityNumber(),
                super.getGrossSales(),
                super.getCommissionRate(),
                this.getBaseSalary(),
                this.getPayment());
    }

    @Override
    double getPayment() {
        return baseSalary + super.getPayment();
    }

}
