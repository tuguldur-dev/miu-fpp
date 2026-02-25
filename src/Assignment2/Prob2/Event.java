package Assignment2.Prob2;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Event {
    private String name;
    private ZonedDateTime datetime;

    public Event(String name, ZonedDateTime dateTime) {
        this.name = name;
        this.datetime = dateTime;
    }


    public void displayProblem1() {
        System.out.println("Day of month: " + datetime.getDayOfWeek());
        System.out.println("Leap year: " + datetime.toLocalDate().isLeapYear());
        LocalDate today = LocalDate.now();
        Period difference = Period.between(today, datetime.toLocalDate());
        System.out.printf("Number of days: %d years, %d months and %d days old%n",
                difference.getYears(), difference.getMonths(), difference.getDays());
    }

    public static final String FORMAT_DATE_PATTERN = "EEEE, MMMM d, yyyy '@' HH:mm '['VV']'";

    public String localDateAsString() {
        return this.datetime.format(DateTimeFormatter.ofPattern(FORMAT_DATE_PATTERN));
    }

    public void printEvent() {
        System.out.println(this.localDateAsString());
    }


    public void changeTimezone(String timezone) {
        this.datetime = this.datetime.withZoneSameInstant(ZoneId.of(timezone));
    }

    public static final String DATE_PATTERN = "yyyy/MM/dd";

    public static LocalDate localDateForString(String date) {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern(DATE_PATTERN));
    }

    public static final String TIME_PATTERN = "HH:mm";

    public static LocalTime localTimeForString(String date) {
        return LocalTime.parse(date, DateTimeFormatter.ofPattern(TIME_PATTERN));
    }
}
