package gymmembership;

public class GymMembership {
    private String memberName;
    private String membershipType;
    private int duration; 

    public GymMembership(String memberName, String membershipType, int duration) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.duration = duration;
    }

    public double calculateFees() {
        double baseRate = 50; 
        if (membershipType.equalsIgnoreCase("Standard")) {
            return baseRate * duration;
        } else if (membershipType.equalsIgnoreCase("Premium")) {
            return baseRate * 1.5 * duration;
        }
        return baseRate * duration;
    }

    public void checkSpecialOffers() {
        if (duration >= 12) {
            System.out.println("Eligible for 1-month free membership!");
        } else {
            System.out.println("No special offers available.");
        }
    }

    public void displayDetails() {
        System.out.println("Member Name: " + memberName);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Total Fees: $" + calculateFees());
        checkSpecialOffers();
    }
}