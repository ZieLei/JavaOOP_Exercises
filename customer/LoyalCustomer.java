package customer;

public class LoyalCustomer extends Customer{

    private double discountRate;

    public LoyalCustomer(String name, String email, double discountRate) {
        super(name, email);
        this.discountRate = discountRate;
    }

    public double applyDiscount(double amount){
        return amount * (1 - discountRate);
    }
    
    @Override
    public void makePurchase(String product, double price) {
        // TODO Auto-generated method stub
        super.makePurchase(product, applyDiscount(price));
    }
}
