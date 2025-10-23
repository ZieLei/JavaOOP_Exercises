package electronicsproduct;

public class WashingMachine extends ElectronicsProduct {
    private int warrantyPeriod;

    public WashingMachine(String productID, String name, double price, int warrantyPeriod) {
        super(productID, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    public void extendWarranty(int extraMonths) {
        warrantyPeriod += extraMonths;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Warranty period: " + warrantyPeriod + " months");
    }
}