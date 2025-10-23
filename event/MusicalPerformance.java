package event;

import java.util.ArrayList;

public class MusicalPerformance extends Event {
    private ArrayList<String> performers;

    public MusicalPerformance(String eventName, String date, String location, ArrayList<String> performers) {
        super(eventName, date, location);
        this.performers = performers;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Performers: " + String.join(", ", performers));
    }
}