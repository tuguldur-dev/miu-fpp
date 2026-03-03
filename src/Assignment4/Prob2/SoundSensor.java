package Assignment4.Prob2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SoundSensor implements Sensor {
    private Location location;
    private LocalTime lastupdated;
    private int soundlevel;
    private String name;
    private double reading;

    SoundSensor(String name, Location location, double reading, int soundlevel) {
        this.name = name;
        this.location = location;
        this.reading = reading;
        this.soundlevel = soundlevel;
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
        return this.location;
    }

    @Override
    public LocalTime getLastUpdated() {
        lastupdated = LocalTime.now();

        return lastupdated;
    }

    @Override
    public String performAction() {
        if(soundlevel > 70) {
            return "an alert to turn on noise cancellation";
        }
        return "Sound is within normal range";
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
