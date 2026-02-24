package Assignment1;


import java.util.Random;

public class QuickEmiQuote {
    static void main() {
        Random rand = new Random();
        int principalMin = 5000;
        int principalMax = 25000;

        int tenureMin = 6;
        int tenureMax = 36;

        double aprMin = 3.5;
        double aprMax = 11.5;

        int p = rand.nextInt(principalMin, principalMax);
        int n = rand.nextInt(tenureMin, tenureMax);

        double apr = Math.round(rand.nextDouble(aprMin, aprMax) * 10.0) / 10.0;

        double r = apr / 12 / 100;

        double emi = (p * r * Math.pow((1 + r), n)) / (Math.pow((1 + r), n) - 1);

        double totalPayment = emi * n;
        double totalInterest = totalPayment - p;

        int emiInt = (int) emi;
        long roundedEmi = Math.round(emi);
        System.out.printf("""
                        P: %d
                        N: %d
                        APR: %.1f
                        r: %.4f
                        EMI: %.2f
                        Total payment: %.2f
                        Total interest: %.2f
                        Casted emi: %d
                        Rounded emi: %d""",
                p, n, apr, r, emi, totalPayment, totalInterest, emiInt, roundedEmi);

    }
}
