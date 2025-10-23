package booking;

import java.util.HashMap;

public class Booking {
    
    private HashMap<String, Boolean> flights, hotels;

    public Booking(){
        flights = new HashMap<>();
        hotels = new HashMap<>();
    }

    public void searchFlight(String flightName){
        for (String flight : flights.keySet()){
            if (flight.equals(flightName)){
                System.out.println("Flight found: " + flight + " Availablity: " + flights.get(flight));
            }
        }
    }

    public void searchHotel(String hotelName){
        for (String hotel : hotels.keySet()){
            if (hotel.equals(hotelName)){
                System.out.println("Hotel found: " + hotel + " Availablity: " + hotels.get(hotel));
            }
        }
    }

    public void addFlight(String flightName){
        flights.put(flightName, true);
    }

    public void addHotel(String hotelName){
        hotels.put(hotelName, true);
    }

    public void bookFlight(String flightName){
        flights.put(flightName, false);
        System.out.println("Flight booked: " + flightName + " Availablity: " + flights.get(flightName));
    }

    public void bookHotel(String hotelName){
        hotels.put(hotelName, false);
        System.out.println("Hotel booked: " + hotelName + " Availablity: " + hotels.get(hotelName));
    }

    public void cancelFlight(String flightName){
        flights.put(flightName, true);
        System.out.println("Flight canceled: " + flightName + " Availablity: " + flights.get(flightName));
    }

    public void cancelHotel(String hotelName){
        hotels.put(hotelName, true);
        System.out.println("Hotel canceled: " + hotelName + " Availablity: " + hotels.get(hotelName));
    }

}
