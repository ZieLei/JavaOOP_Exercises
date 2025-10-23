package event;

import java.util.ArrayList;

public class EventMain {
    public static void main(String[] args) {
        Seminar seminar = new Seminar("Java Workshop", "2025-11-15", "Hall A", 3);
        ArrayList<String> band = new ArrayList<>();
        band.add("Alice");
        band.add("Bob");
        MusicalPerformance concert = new MusicalPerformance("Rock Night", "2025-11-15", "Hall A", band);

        System.out.println("Seminar Info:");
        seminar.displayDetails();
        System.out.println("\nConcert Info:");
        concert.displayDetails();

        System.out.println("\nDo the events conflict?");
        System.out.println(seminar.conflictsWith(concert) ? "Yes" : "No");
    }
}
