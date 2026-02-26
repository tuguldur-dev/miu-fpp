package Assignment2.Prob3;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Enter F for Flight Booking");
            System.out.println("Enter H for Hotel Booking");
            System.out.println("Enter C for Car Rental\n");
            String userInput = scanner.next();

            switch (userInput) {
                case "f","F":
                    System.out.print("Enter origin: ");
                    String origin = scanner.next();

                    System.out.print("Enter destination: ");
                    String destination = scanner.next();

                    System.out.print("Enter distance in km: ");
                    double distanceKm = scanner.nextDouble();

                    System.out.print("Enter average speed (km/h): ");
                    double avgSpeed = scanner.nextDouble();
                    FlightBooking flightBooking = new FlightBooking(origin, destination, distanceKm);
                    double time = flightBooking.computeFlightTime(avgSpeed);

                    System.out.printf("\nEstimated Flight Time: %.2f hours", time);
                    break;
                case "h","H":

                    System.out.print("Enter hotel name: ");
                    scanner.nextLine(); // because of hotel named "holiday inn"
                    String hotel = scanner.nextLine();
                    System.out.print("Enter number of nights: ");
                    int nights = scanner.nextInt();

                    System.out.print("Enter price per night: ");
                    double pricePerNight = scanner.nextDouble();

                    HotelBooking hotelBooking = new HotelBooking(hotel, nights, pricePerNight);
                    double hotelCost = hotelBooking.totalCost();

                    System.out.printf("\nTotal Hotel Cost: %.2f", hotelCost);

                    break;
                case "c","C":
                    System.out.print("Enter car model: ");
                    String model = scanner.next();

                    System.out.print("Enter number of days: ");
                    int days = scanner.nextInt();

                    System.out.print("Enter rate per day: ");
                    double ratePerDay = scanner.nextDouble();

                    System.out.print("Enter miles per day: ");
                    double milesPerDay = scanner.nextDouble();

                    CarRental carRental = new CarRental(model, days, ratePerDay, milesPerDay);
                    System.out.printf("\nTotal Rental Cost: %.2f", carRental.totalRentalCost());
                    System.out.printf("\nTotal Miles Allowed: %.2f", carRental.totalMilesAllowed());
                    break;
            }

            System.out.println("\nDo you want to continue  (y/n)");
            input = scanner.next();
            if (input.equalsIgnoreCase("n")) {
                break;
            }
        } while (input.equalsIgnoreCase("y"));
    }
}
