package Assignment1;

public class Prog4 {
    static double a(int n) {
        double sum = 0;
        double num;
        for (int i = 1; i <= n; i++) {
            num = (i * 2) - 1;
            if (i % 2 != 0) {
                sum += (1 / num);
            } else {
                sum -= (1 / num);
            }
        }
        return sum;
    }

    static double b(int n) {
        double sum = 0;
        double num;
        for (int i = 1; i <= n; i++) {
            num = Math.pow(2, i);
            if (i % 2 != 0) {
                sum += (i / num);
            } else {
                sum -= (i / num);
            }
        }
        return sum;
    }


    static void main() {
        int n = 5;
        System.out.printf("SUM %.3f\n", a(n));
        System.out.printf("SUM %.3f\n", b(n));
    }
}
