package movie;

import java.util.ArrayList;

public class Movie {
    
    private String title, director, actors;
    private ArrayList<String> reviews;

    public Movie(String title, String director, String actors){
        this.title = title;
        this.director = director;
        this.actors = actors;
        reviews = new ArrayList<>();
    }

    public void addReview(String message){
        reviews.add(message);
    }

public void printReviews() {
    for (String review : reviews) {
        System.out.println(review);
    }
}

}
