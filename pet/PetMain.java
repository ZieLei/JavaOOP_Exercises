package pet;

public class PetMain {
    public static void main(String[] args) {
         Dog dog = new Dog("Buddy", 3, "Ball");
        Bird bird = new Bird("Tweety", 2, 0.25);

        dog.displayDetails();
        System.out.println();
        bird.displayDetails();
    }
}
