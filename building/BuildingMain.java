package building;

public class BuildingMain {
    public static void main(String[] args) {
        ResidentialBuilding rb = new ResidentialBuilding("123 Maple St", 5, 1000, 10, 500);
        CommercialBuilding cb = new CommercialBuilding("456 Oak Ave", 8, 2000, 1500, 20);

        System.out.println("Residential Building Info:");
        rb.displayInfo();
        System.out.println("\nCommercial Building Info:");
        cb.displayInfo();
    }
}
