package building;

public class ResidentialBuilding extends Building {
    private int numberOfApartments;
    private double rentPerApartment;

    public ResidentialBuilding(String address, int floors, double totalArea, int numberOfApartments, double rentPerApartment) {
        super(address, floors, totalArea);
        this.numberOfApartments = numberOfApartments;
        this.rentPerApartment = rentPerApartment;
    }

    public double calculateTotalRent() {
        return numberOfApartments * rentPerApartment;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of apartments: " + numberOfApartments);
        System.out.println("Rent per apartment: $" + rentPerApartment);
        System.out.println("Total rent: $" + calculateTotalRent());
    }
}