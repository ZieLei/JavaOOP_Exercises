package booking;

public class BookingMain {
    
    public static void main(String[] args) {
        Booking booking = new Booking();

        booking.addFlight("Air Asia");
        booking.addFlight("Boeing");
        booking.addFlight("Qatar Airways");
        booking.addFlight("Emirates");

        booking.addHotel("Cocos Hotel");
        booking.addHotel("Blue Lotus Hotel");
        booking.addHotel("Hazbin Hotel");
        booking.addHotel("Marco Polo Hotel");

        booking.searchFlight("Boeing");
        booking.searchHotel("Cocos Hotel");

        booking.bookFlight("Emirates");
        booking.bookHotel("Marco Polo Hotel");

        booking.cancelFlight("Emirates");
        booking.cancelHotel("Marco Polo Hotel");
    }
}
