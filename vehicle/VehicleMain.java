package vehicle;

public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2022, 450);
        Truck truck = new Truck("Ford", "F-150", 2021, 1200);

        car.displayInfo();
        truck.displayInfo();
    }
}
