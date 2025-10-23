package reservation;

public class Reservation {
    private String reservationID;
    private String customerName;
    private String date;

    public Reservation(String reservationID, String customerName, String date) {
        this.reservationID = reservationID;
        this.customerName = customerName;
        this.date = date;
    }

    public void displayReservation() {
        System.out.println("Reservation ID: " + reservationID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Date: " + date);
    }

    public void modifyReservation(String customerName, String date) {
        this.customerName = customerName;
        this.date = date;
    }
}

