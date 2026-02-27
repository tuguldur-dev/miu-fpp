package Assignment3;

public class Prob3 {
    public boolean IsPalindrome(int original) {
        if (original <= 0) {
            return true;
        }
        int digit = findDigit(original);

        int first = original / digit;
        int last = original % 10;

        if (first == last) {
            int newNumber = original % digit;
            newNumber = newNumber / 10;
            return IsPalindrome(newNumber);
        }

        return false;
    }

    int findDigit(int number) {
        if (number < 10) {
            return 1;
        }
        return findDigit(number / 10) * 10;
    }


}
