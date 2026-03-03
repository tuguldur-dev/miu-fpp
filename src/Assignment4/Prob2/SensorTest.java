package Assignment4.Prob2;

public class SensorTest {
    static void main() {
        Sensor[] sensors = new Sensor[]{
                new TemparatureSensor("Temperature", Location.Living_Room, 23.5, 13),
                new LightSensor("Light", Location.Garden, 12, 12),
                new SoundSensor("Sound", Location.Bedroom, 65, 13),
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
