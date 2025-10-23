package vehicle;

public class Truck extends Vehicle {

    private double payloadCapacity;

    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year);
        //TODO Auto-generated constructor stub
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void displayInfo() {
        // TODO Auto-generated method stub
        super.displayInfo();
        System.out.println("Payload capacity: " + payloadCapacity);
    }
    
}
