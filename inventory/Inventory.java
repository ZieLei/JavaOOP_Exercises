package inventory;

import java.util.HashMap;

public class Inventory {
    private HashMap<String, Integer> products = new HashMap<>();

    public Inventory(){

    }

    public void addProduct(String product, int inventory){
        products.put(product, inventory);
        System.out.println("Product added: " + product);
    }

    public void removeProduct(String product){
        products.remove(product);
        System.out.println("Product removed: " + product);
    }

    public void checkLowInventory(){
        boolean anyLow = false;
        for (String product : products.keySet()){
            int quantity = products.get(product);
            if(quantity <= 10){
                System.out.println("Low inventory: " + product + " (" + quantity + " left)");
                anyLow = true;
            }
        }
        if (!anyLow){
            System.out.println("All products are sufficient.");
        }
    }

}
