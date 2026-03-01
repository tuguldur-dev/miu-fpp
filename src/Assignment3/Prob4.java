package Assignment3;

public class Prob4 {
    int findMax(int[] numbers, int index) {
        if (numbers == null || numbers.length == 0) {
            return -1;
        }
        if (numbers.length - 1 == index) {
            return numbers[index];
        }
        int current = numbers[index];
        int next = findMax(numbers, index + 1);
        return next < current ? current : next;
    }


    void main() {
        int[] numbers = {5, -3, 6, 1, 9, 4};
        IO.println(findMax(numbers, 0));
    }
}
