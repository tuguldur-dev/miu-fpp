package Assignment4.Prob2;

public class SensorTest {
    static void main() {
        Sensor[] sensors = new Sensor[]{
                new TemparatureSensor(Location.Living_Room, 23.5, 13),
                new LightSensor(Location.Garden, 12, 12),
                new SoundSensor(Location.Bedroom, 65, 13),
                new SoundSensor(Location.Garden, 45, 12),
                new SoundSensor(Location.Bedroom, 65, 13),
        };

        for (Sensor sensor : sensors) {
            switch (sensor) {
                case LightSensor lightSensor -> System.out.println(lightSensor);
                case SoundSensor soundSensor -> System.out.println(soundSensor);
                case TemparatureSensor temparatureSensor -> System.out.println(temparatureSensor);
                default -> System.out.println("Sensor not found");
            }
        }

    }
}
