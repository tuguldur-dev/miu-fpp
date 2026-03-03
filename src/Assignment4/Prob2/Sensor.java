package Assignment4.Prob2;


import java.time.LocalTime;

public interface Sensor {
    String getSensorType();

    double getReading();

    Location getLocation();

    LocalTime getLastUpdated();

    String performAction();
}

