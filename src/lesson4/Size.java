package lesson4;

enum Sizes {
    SMALL,
    MEDIUM,
    LARGE
}

class sample {
    void display(Sizes size) {
        switch (size) {
            case SMALL -> System.out.println("Small");
            case MEDIUM -> System.out.println("Medium");
            case LARGE -> System.out.println("Large");
        }
    }
}

public class Size {
    static void main() {
        sample s = new sample();
        s.display(Sizes.MEDIUM);
        s.display(Sizes.LARGE);
        s.display(Sizes.SMALL);
    }
}


