package Assignment3;

public class Prob1 {
    static char findMinimum(String word) {
        if (word == null || word.isEmpty()) {
            return Character.MAX_VALUE;
        }
        char current = word.charAt(0);
        char next = findMinimum(word.substring(1));
        return next > current ? current : next;
    }

    static void main() {
        IO.println(findMinimum("akel"));
    }
}
