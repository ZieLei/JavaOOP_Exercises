package electronicsproduct;

public class WashinMachineMain {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine("WM1001", "SuperWash 3000", 500, 24);
        wm.displayInfo();
        
        wm.applyDiscount(10); 
        System.out.println("Price after discount: $" + wm.calculateFinalPrice());
        
        wm.extendWarranty(12); 
        System.out.println("Updated info:");
        wm.displayInfo();
    }
}
