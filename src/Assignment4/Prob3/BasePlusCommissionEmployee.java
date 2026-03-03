package Assignment4.Prob3;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
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
                        Payment: %.2f
                        """,
                this.getFirstName(),
                this.getLastName(),
                this.getSocialSecurityNumber(),
                this.getPayment());
    }

    @Override
    double getPayment() {
        return baseSalary + this.getGrossSales() * this.getCommissionRate();
    }

}
