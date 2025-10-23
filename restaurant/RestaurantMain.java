package restaurant;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        MenuItem item1 = new MenuItem("Rice", 20.00, 5.0);
        MenuItem item2 = new MenuItem("Buttered Chicken", 55.50, 4.4);
        MenuItem item3 = new MenuItem("Fried Fish", 40.99, 3.9);
        MenuItem item4 = new MenuItem("Tinola", 36.79, 4.6);

        restaurant.addMenuItem(item1);
        restaurant.addMenuItem(item2);
        restaurant.addMenuItem(item3);
        restaurant.addMenuItem(item4);

        System.out.println("Average rating: " + restaurant.calculateAverageRating());
    }
}
