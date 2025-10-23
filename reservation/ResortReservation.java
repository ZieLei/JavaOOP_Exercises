package reservation;

public class ResortReservation extends Reservation {
    private int roomNumber;
    private String status;

    public ResortReservation(String reservationID, String customerName, String date, int roomNumber) {
        super(reservationID, customerName, date);
        this.roomNumber = roomNumber;
        this.status = "Confirmed";
    }

    public void checkStatus() {
        System.out.println("Resort Reservation Status: " + status);
    }

    public void modifyRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void displayReservation() {
        super.displayReservation();
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Status: " + status);
    }
}
