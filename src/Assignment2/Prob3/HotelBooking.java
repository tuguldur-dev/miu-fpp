package Assignment2.Prob3;

public record HotelBooking(String hotelName, double nights, double pricePerNight) {
    public HotelBooking {
        if (hotelName == null || hotelName.isEmpty()) {
            throw new IllegalArgumentException("Invalid input origin");
        }
    }

    public double totalCost() {
        return nights * pricePerNight;
    }
}
