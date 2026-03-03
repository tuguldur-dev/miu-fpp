package lesson7;

public class TestComputation implements Computation {
    void main() {
        Computation obj = new TestComputation();
        System.out.println("Interest is " + Computation.INTEREST);
        int res1 = obj.add(12, 30);
        System.out.println("The sum:" + res1);
        res1 = add(10, 20);
        System.out.println("The sum:" + res1);
        System.out.println("The sum of double: " + obj.add(12, 24.2));
        double x = 1.2;
        System.out.println("The sum of double: " + obj.add(x, x));

        // You can go with default interface behaviour
        System.out.println("The concat of string: " + obj.concat(null, "b"));
        System.out.println("The concat of string: " + obj.concat("a", "b", "s"));
        System.out.println("Date format: " + Computation.StringToLocalDate("03/02/2024"));


    }

    @Override
    public int add(int x, int y) {
        System.out.println("By int");
        return x + y;
    }

    @Override
    public double add(double d1, double d2) {
        System.out.println("By double");
        return d1 + d2;
    }


    @Override
    public String concat(String d1, String d2, String d3) {
        System.out.println("By test");
        return d1 + " - " + d2 + " - " + d3;
    }
}
