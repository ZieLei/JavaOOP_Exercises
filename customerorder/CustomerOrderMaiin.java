package customerorder;

public class CustomerOrderMaiin {
    public static void main(String[] args) {
        OnlineOrder order = new OnlineOrder("ORD123", "Alice", "2025-10-23", "123 Local St", "TRK456");
        order.displayOrderDetails();

        System.out.println("\nUpdating tracking status...");
        order.updateTrackingStatus("Shipped");
        order.displayOrderDetails();
    }
}
