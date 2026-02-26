package lesson3;

import java.time.LocalDate;
import java.time.Period;

public class LocalDateDemo {

    static void printPeriod(Period per) {
        System.out.println(per);
        System.out.println(per.getDays() + " days");
        System.out.println(per.getMonths() + " months");
        System.out.println(per.getYears() + " years");
    }

    static void main() {
        LocalDate today = LocalDate.now();
        System.out.println("Today's date" + today);

        LocalDate birth = LocalDate.of(2000, 02, 27);
        System.out.println("Quizdate:" + birth);
        birth = birth.plusDays(3);

        System.out.println("Postoned Quizdate:" + birth);

        Period per = Period.between(birth, today);
        printPeriod(per);




    }
}
