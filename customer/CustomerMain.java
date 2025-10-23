package customer;

public class CustomerMain {
    public static void main(String[] args) {
        LoyalCustomer localCustomer = new LoyalCustomer("Alice", "alice@email.com", 0.1);
        
        localCustomer.makePurchase("Durian", 100); 
        localCustomer.makePurchase("Coca-Cola", 50);

        Customer normalCustomer = new Customer("John", "johndoe@gmail.com");

        normalCustomer.makePurchase("Durian", 100);
        normalCustomer.makePurchase("Coca-Cola", 50);

        localCustomer.totalExpenditures();
        normalCustomer.totalExpenditures();
    
    }
}
