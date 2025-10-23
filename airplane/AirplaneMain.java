package airplane;

import java.time.Duration;
import java.time.LocalTime;

public class AirplaneMain {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane(10001, "Florida", LocalTime.parse("20:30"), false);
        airplane1.checkFlightStatus();

        Airplane airplane2 = new Airplane(10002, "Alabama", LocalTime.parse("21:30"), true);

        airplane2.checkFlightStatus();

        delayedTime(airplane2);
    }

    public static void delayedTime(Airplane airplane){
        Duration delay = Duration.between(airplane.getDepartureTime(), LocalTime.parse("23:30"));
        long hours = delay.toHours();
        long minutes = delay.toMinutes() % 60;
        System.out.println("Flight delayed for: " + hours + " hours " + minutes + " minutes");

    }
}
