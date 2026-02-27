package lesson5;

public class Main {
    public static int length(String str) {
        if (str == null || str.isEmpty())// base case
            return 0;
        else // Recursive case
            return 1 + length(str.substring(1));
    }

    public static String reversion(String str) {
        if (str == null || str.isEmpty())// base case
            return "";

        return reversion(str.substring(1)) + str.charAt(0);
    }

    public static void reversionPrint(String str) {
        if (str == null || str.isEmpty()) {

            return;
        }
        reversion(str.substring(1));
        IO.println(str.charAt(0));

    }

    public static int fact(int num) {
        if (num == 0 || num == 1) {
            return num;
        }

        return num * fact(num - 1);
    }

    //
    public static int sumEven(int num) {
        if (num < 1) {
            IO.print("=");
            return 0;
        }
        if (num % 2 == 0) {
            IO.print(num + " ");
            return num + sumEven(num - 2);
        }
        return sumEven(num - 1);
    }

    public static int sumOdd(int num) {
        if (num < 1) {
            IO.print("=");
            return 0;
        }
        if (num % 2 != 0) {
            IO.print(num + " ");
            return num + sumOdd(num - 2);
        }
        return sumOdd(num - 1);
    }

    public static int BinarySearch(int[] array, int target, int start, int end) {
        int mid = (start + end) / 2;
        if (target == array[mid]) {
            return mid;
        } else if (target > array[mid]) {
            return BinarySearch(array, target, mid + 1, end);
        }
        return BinarySearch(array, target, start, mid - 1);

    }


    static void main() {
        IO.println(sumEven(8)); // 2 + 4
        IO.println(sumOdd(8)); // 1 + 3 + 5
        int[] check = {1, 2, 3, 4, 5, 6, 7, 8};
        IO.println(BinarySearch(check, 1, 0, 8)); // 1 + 3 + 5

    }
}
