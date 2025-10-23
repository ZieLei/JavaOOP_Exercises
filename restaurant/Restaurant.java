package restaurant;

import java.util.ArrayList;

public class Restaurant {
    
    private ArrayList<MenuItem> menuItems;

    public Restaurant(){
        menuItems = new ArrayList<>();
    }

    public double calculateAverageRating(){
        double sum = 0;
        for (MenuItem menuItem : menuItems){
            sum += menuItem.getRating();
        }

        return sum / menuItems.size();
    }

    public void addMenuItem(MenuItem menuItem){
        menuItems.add(menuItem);
    }

    public void removeMenuItem(MenuItem menuItem){
        menuItems.remove(menuItem);
    }
}
