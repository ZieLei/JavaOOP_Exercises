package reservation;

public class ReservationMain {
    public static void main(String[] args) {
        ResortReservation resort = new ResortReservation("R001", "Alice", "2025-12-01", 101);
        RailwayReservation railway = new RailwayReservation("T001", "Bob", "2025-12-01", 25);

        resort.displayReservation();
        resort.checkStatus();
        resort.modifyRoomNumber(102);
        resort.modifyReservation("Alice Smith", "2025-12-02");
        resort.displayReservation();

        System.out.println();

        railway.displayReservation();
        railway.checkStatus();
        railway.modifySeatNumber(30);
        railway.modifyReservation("Bob Lee", "2025-12-03");
        railway.displayReservation();
    }
}
