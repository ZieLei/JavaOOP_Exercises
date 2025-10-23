package event;

public class Seminar extends Event {
    private int numberOfSpeakers;

    public Seminar(String eventName, String date, String location, int numberOfSpeakers) {
        super(eventName, date, location);
        this.numberOfSpeakers = numberOfSpeakers;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of speakers: " + numberOfSpeakers);
    }
}
