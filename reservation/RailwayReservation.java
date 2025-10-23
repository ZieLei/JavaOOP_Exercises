package reservation;

public class RailwayReservation extends Reservation {
    private int seatNumber;
    private String status;

    public RailwayReservation(String reservationID, String customerName, String date, int seatNumber) {
        super(reservationID, customerName, date);
        this.seatNumber = seatNumber;
        this.status = "Confirmed";
    }

    public void checkStatus() {
        System.out.println("Railway Reservation Status: " + status);
    }

    public void modifySeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public void displayReservation() {
        super.displayReservation();
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Status: " + status);
    }
}