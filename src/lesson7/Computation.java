package lesson7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface Computation {
    double INTEREST = 5.5; // This line is equivalent to public static final double INTEREST 5.5

    // Methods - Unimplemeneted - public abstract - Nobody
    public abstract int add(int x, int y);

    double add(double d1, double d2); // This method is also public abstract

    // Implemented methods - default implementation (belongs to objects or static implementation - Interface level)

    default String concat(String s1, String s2) {
        if (!input(s1, s2)) {
            return null;
        }
        return s1 + " " + s2;
    }

    public default String concat(String s1, String s2, String s3) {
        return s1 + " " + s2 + " " + s3;
    }

    private boolean input(String x, String y) {
        return x != null && y != null;
    }

    static LocalDate StringToLocalDate(String date) {
        String PATTERN = "MM/dd/yyyy";
        return LocalDate.parse(date, DateTimeFormatter.ofPattern(PATTERN));
    }

}
