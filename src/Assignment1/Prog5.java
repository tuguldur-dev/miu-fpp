package Assignment1;

public class Prog5 {
    public static void secondMin(int[] arrayOfInts) {
        if (arrayOfInts.length == 0) {
            return;
        }
        int min = arrayOfInts[0];
        for (int i = 1; i < arrayOfInts.length; i++) {
            if (min > arrayOfInts[i]) {
                min = arrayOfInts[i];
            }
        }

        int secondMin = arrayOfInts[0];

        for (int i = 1; i < arrayOfInts.length; i++) {
            if (min == arrayOfInts[i]) {
                continue;
            }
            if (secondMin > arrayOfInts[i]) {
                secondMin = arrayOfInts[i];
            }
        }

        IO.println(secondMin);
    }

    static void main() {
        int[] array = {2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};
        secondMin(array);
    }
}
