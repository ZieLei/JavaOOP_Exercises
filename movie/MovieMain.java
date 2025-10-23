package movie;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie1 = new Movie("The Minecraft Movie 3", "Markus Persson", "Steve, Alex and Jason Mamoa");

        movie1.addReview("This movie was life-changing! I can't wait for Minecraft 4 featuring Eleven from Stranger Things!!");
        movie1.addReview("I can't believe it.. Leagues better than the 2nd version, Notch really outdid himself with this one.");
        movie1.addReview("I like the part where Steve said \"It's crafting time\" and crafted all over the place.. truly eye opening...");

        movie1.printReviews();
    }
}
