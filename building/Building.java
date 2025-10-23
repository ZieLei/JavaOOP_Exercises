package building;

public class Building {
    
    private String address;
    private int numberOfFloors;
    private double totalArea;

    public Building(String address, int numberOfFloors, double totalArea){
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        this.totalArea = totalArea;
    }

    public void displayInfo(){
        System.out.println("Building address: " + address + ",  Floors: "+ numberOfFloors + ", Total Area: " + totalArea);
    }

}
