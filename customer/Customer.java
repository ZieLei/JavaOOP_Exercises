package customer;

import java.util.HashMap;

public class Customer {
    
    private String name, email;
    private HashMap<String, Double> purchaseHistory;

    public Customer(String name, String email){
        this.name = name;
        this.email = email;
        purchaseHistory = new HashMap<>();
    }

    public void makePurchase(String product, double price){
        String history = "Purchased: " + product;
        purchaseHistory.put(history, price);
    }

    public void totalExpenditures(){
        double total = 0;
        for (double price : purchaseHistory.values()){
            total += price;
        }

        System.out.println("Customer: "+ name + "'s total expenditure: " + total);
    }
}
