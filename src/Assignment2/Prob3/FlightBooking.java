package Assignment2.Prob3;

public record FlightBooking(String origin, String destination, double distanceKM) {
    public FlightBooking {
        if (origin == null || origin.isEmpty()) {
            throw new IllegalArgumentException("Invalid input origin");
        }
        if (destination == null || destination.isEmpty()) {
            throw new IllegalArgumentException("Invalid input destination");
        }
    }

    public double computeFlightTime(double avgSpeed) {
        if (avgSpeed == 0) {
            return 0;
        }
        return distanceKM / avgSpeed;
    }
}
