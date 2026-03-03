package Assignment4.Prob3;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        if(firstName == null || lastName == null || socialSecurityNumber == null){
            throw new IllegalArgumentException("Employee's basic can't be empty");
        }
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    double getPayment() {
        return wage * hours;
    }

    @Override
    public String toString() {
        return String.format("""
                        First Name: %s
                        Last Name: %s
                        SNN: %s
                        Wage: %.2f
                        Hours: %.2f
                        Payment: %.2f
                        """,
                this.getFirstName(),
                this.getLastName(),
                this.getSocialSecurityNumber(),
                this.getWage(),
                this.getHours(),
                this.getPayment());
    }
}
