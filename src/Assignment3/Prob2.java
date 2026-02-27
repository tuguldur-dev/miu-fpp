package Assignment3;

import java.util.Arrays;

public class Prob2 {
    static void reverse(int[] array, int index) {
        if (index > array.length / 2) {
            return;
        }
        int end = (array.length - 1) - index;
        int temp = array[index];
        array[index] = array[end];
        array[end] = temp;
        reverse(array, index + 1);
    }


    static void main() {
        int[] array = {1, 3, 5, 7, 9, 13};
        IO.println(Arrays.toString(array));
        reverse(array, 0);
        IO.println(Arrays.toString(array));
    }
}
