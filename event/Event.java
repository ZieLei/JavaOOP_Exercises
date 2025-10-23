package event;

// Base class
public class Event {
    private String eventName;
    private String date;
    private String location;

    public Event(String eventName, String date, String location) {
        this.eventName = eventName;
        this.date = date;
        this.location = location;
    }

    public void displayDetails() {
        System.out.println("Event: " + eventName);
        System.out.println("Date: " + date);
        System.out.println("Location: " + location);
    }

    public boolean conflictsWith(Event other) {
        return this.date.equals(other.date) && this.location.equals(other.location);
    }
}