package inventory;

public class InventoryMain {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addProduct("Pic-A", 290);
        inventory.addProduct("Presto", 77);
        inventory.addProduct("Oreo", 9);
        inventory.addProduct("Blast", 180);
        inventory.addProduct("Nova", 2);

        inventory.checkLowInventory();

        inventory.removeProduct("Nova");

        inventory.checkLowInventory();
    }
}
