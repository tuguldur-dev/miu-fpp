package Assignment2.Prob2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String input;
        Event event;
        LocalDate localDate;
        LocalTime localTime;
        ZonedDateTime dateTimeWithZone;

        do {
            System.out.print("Enter your event name: ");
            String name = scanner.next();

            System.out.print("\nEnter event date (2000/01/01): ");
            String date = scanner.next();
            localDate = Event.localDateForString(date);

            System.out.print("\nEnter event time (13:30): ");
            String time = scanner.next();
            localTime = Event.localTimeForString(time);

            System.out.print("\nEnter timezone (America/Chicago): ");
            String timezone = scanner.next();

            dateTimeWithZone = ZonedDateTime.of(localDate, localTime, ZoneId.systemDefault());

            event = new Event(name, dateTimeWithZone);
            System.out.println("Task 1: -------------------");
            event.displayProblem1();
            System.out.println("Task 2: -------------------");
            event.printEvent();
            event.changeTimezone(timezone);
            System.out.println("Task 3: -------------------");
            event.printEvent();


            System.out.println("Do you want to schedule another meeting (y/n)");
            input = scanner.next();
            if (input.equalsIgnoreCase("n")) {
                break;
            }
        } while (input.equalsIgnoreCase("y"));
    }
}
