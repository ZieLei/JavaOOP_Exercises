package pet;

public class Bird extends Pet {
    private double wingspan;

    public Bird(String name, int age, double wingspan) {
        super(name, "Bird", age);
        this.wingspan = wingspan;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Wingspan: " + wingspan + " meters");
        System.out.println("Age in human years: " + calculateHumanAge());
    }
}
