package customerorder;

public class CustomerOrder {
    private String orderID;
    private String customer;
    private String orderDate;

    public CustomerOrder(String orderID, String customer, String orderDate) {
        this.orderID = orderID;
        this.customer = customer;
        this.orderDate = orderDate;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer: " + customer);
        System.out.println("Order Date: " + orderDate);
    }
}
