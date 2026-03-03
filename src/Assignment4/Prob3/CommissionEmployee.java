package Assignment4.Prob3;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        if (firstName == null || lastName == null || socialSecurityNumber == null) {
            throw new IllegalArgumentException("Employee's basic can't be empty");
        }
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    double getPayment() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return String.format("""
                        First Name: %s
                        Last Name: %s
                        SNN: %s
                        Gross Sales: %.2f
                        Commission Rate: %.2f
                        Payment: %.2f
                        """,
                this.getFirstName(),
                this.getLastName(),
                this.getSocialSecurityNumber(),
                this.getGrossSales(),
                this.getCommissionRate(),
                this.getPayment());
    }
}
