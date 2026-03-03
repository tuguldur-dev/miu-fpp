package Assignment4.Prob2;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TemparatureSensor implements Sensor {
    private Location location;
    private LocalTime lastupdated;
    private int temperature;
    private String name;
    private double reading;


    TemparatureSensor(String name, Location location, double reading, int temperature) {
        this.name = name;
        this.location = location;
        this.reading = reading;
        this.temperature = temperature;
        getLastUpdated();
    }

    @Override
    public String getSensorType() {
        return this.name;
    }

    @Override
    public double getReading() {
        return this.reading;
    }

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public LocalTime getLastUpdated() {
        lastupdated = LocalTime.now();
        return lastupdated;
    }

    @Override
    public String performAction() {
        if (temperature > 30) {
            return "an alert to turn on the AC";
        } else if (temperature < 18) {
            return "an alert to turn on the Heater";
        }
        return "Temperature is in normal range";
    }

    @Override
    public String toString() {
        return String.format("""
                        Sensor Type: %s
                        Reading: %.1f
                        Location: %s
                        Last Updated: %s
                        Action: %s
                        """,
                this.getSensorType(),
                this.reading,
                this.location,
                this.lastupdated.format(DateTimeFormatter.ofPattern("HH:mm a")),
                this.performAction());

    }
}
