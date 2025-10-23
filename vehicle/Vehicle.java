package vehicle;

public class Vehicle {
    private String make, model;
    private int year;

    public Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo(){
        System.out.println("Car make: " + make + " Model: " + model + " Year: " + year);
    }
}
