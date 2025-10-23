package building;

public class CommercialBuilding extends Building {
    private double officeSpace;
    private double rentPerSqMeter;

    public CommercialBuilding(String address, int floors, double totalArea, double officeSpace, double rentPerSqMeter) {
        super(address, floors, totalArea);
        this.officeSpace = officeSpace;
        this.rentPerSqMeter = rentPerSqMeter;
    }

    public double calculateTotalRent() {
        return officeSpace * rentPerSqMeter;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Office space: " + officeSpace + " sq.m");
        System.out.println("Rent per sq.m: P" + rentPerSqMeter);
        System.out.println("Total rent: P" + calculateTotalRent());
    }
}

