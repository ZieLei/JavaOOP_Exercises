package vehicle;

public class Car extends Vehicle {

    private double trunkSize;

    public Car(String make, String model, int year, double trunkSize) {
        super(make, model, year);
        this.trunkSize = trunkSize;
    }

    @Override
    public void displayInfo() {
        // TODO Auto-generated method stub
        super.displayInfo();
        System.out.println("Trunk Size: " + trunkSize);
    }
    
}
