package dog;

public class DogMain {
    public static void main(String[] args) {

        Dog doggy1 = new Dog("Immortal", "Husnine");
        Dog doggy2 = new Dog("Blacky", "German Shepherd");

        System.out.println("Name: " + doggy1.getName() + " Breed: " + doggy1.getBreed());
        System.out.println("Name: " + doggy2.getName() + " Breed: " + doggy2.getBreed());

        doggy1.setName("Mythical Immortal");
        doggy1.setBreed("Husky + Canine");

        doggy2.setBreed("Toad");
        doggy2.setName("Froggy 2");

        System.out.println("Name: " + doggy1.getName() + " Breed: " + doggy1.getBreed());
        System.out.println("Name: " + doggy2.getName() + " Breed: " + doggy2.getBreed());
    }
}
