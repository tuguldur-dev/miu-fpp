package Assignment1;

import java.util.Arrays;

public class Prog3 {
    static void main() {
        String[] strings = {"horse", "dog", "cat", "horse", "dog"};

        int index = 0;
        String[] newStrings = new String[strings.length];

        for (String string : strings) {
            boolean found = false;
            for (String _string : newStrings) {
                if (string.equals(_string)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                newStrings[index] = string;
                index++;
            }
        }

        newStrings = Arrays.copyOf(newStrings, index);

        IO.println("Old array:" + Arrays.toString(strings));
        IO.println("New array:" + Arrays.toString(newStrings));
    }
}
