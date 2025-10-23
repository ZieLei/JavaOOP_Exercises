package airplane;

import java.time.LocalTime;

public class Airplane {
    private int flightNumber;
    private String destination;
    private LocalTime departureTime;  
    private boolean isDelayed;

    public Airplane(int flightNumber, String destination, LocalTime departureTime, boolean isDelayed){
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.isDelayed = isDelayed;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void checkFlightStatus(){
        System.out.println("Flight Status: " + (isDelayed ? "Delayed" : "Active"));
    }
}
