package customerorder;

public class OnlineOrder extends CustomerOrder {
    private String deliveryAddress;
    private String trackingNumber;
    private String trackingStatus;

    public OnlineOrder(String orderID, String customer, String orderDate, String deliveryAddress, String trackingNumber) {
        super(orderID, customer, orderDate);
        this.deliveryAddress = deliveryAddress;
        this.trackingNumber = trackingNumber;
        this.trackingStatus = "Processing";
    }

    public int calculateDeliveryTime() {
        if (deliveryAddress.toLowerCase().contains("local")) {
            return 2;
        } else {
            return 5;
        }
    }

    public void updateTrackingStatus(String newStatus) {
        this.trackingStatus = newStatus;
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Tracking Status: " + trackingStatus);
        System.out.println("Estimated Delivery Time: " + calculateDeliveryTime() + " days");
    }
}