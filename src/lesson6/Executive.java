package lesson6;

class Executive extends Manager {
    private double companyShare;
    private double bonus;

    public Executive(String name, double salary, int year,
                     int month, int day, double share) {
        super(name,salary,year,month,day);
        bonus = 0;
        companyShare = share;
    }
    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
    public void setBonus(double b) {
        bonus = b;
    }
    public double getBonus() {
        return bonus;
    }
    public void setCompanyShare(double b) {
        companyShare = b;
    }
    public double getCompanyShare() {
        return companyShare;
    }
}
