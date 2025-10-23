package electronicsproduct;

public class ElectronicsProduct {
    private String productID, name;
    private double price;

    public ElectronicsProduct(String productID, String name, double price){
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    public void applyDiscount(double percent){
        price = price *  (1 - percent / 100);
    }

    public double calculateFinalPrice(){
        return price;
    }

    public void displayInfo() {
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
    }
}
