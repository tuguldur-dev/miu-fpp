package Assignment4.Prob2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LightSensor implements Sensor {
    private Location location;
    private double reading;
    private LocalTime lastupdated;
    private int lightlevel;

    LightSensor(Location location, double reading, int lightlevel) {
        this.location = location;
        this.reading = reading;
        this.lightlevel = lightlevel;
        getLastUpdated();
    }

    @Override
    public String getSensorType() {
        String className = getClass().getSimpleName();
        return className.substring(0, className.length() - 6);
    }

    @Override
    public double getReading() {
        return this.reading;
    }

    @Override
    public Location getLocation() {
        return this.location;
    }

    @Override
    public LocalTime getLastUpdated() {
        lastupdated = LocalTime.now();
        return lastupdated;
    }

    @Override
    public String performAction() {
        if (lightlevel < 100) {
            return "an alert to turn on the light";
        }
        return "Light is sufficient";
    }

    @Override
    public String toString() {
        getLastUpdated();
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
