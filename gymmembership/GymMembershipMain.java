package gymmembership;

public class GymMembershipMain {
    public static void main(String[] args) {
        GymMembership standardMember = new GymMembership("Alice", "Standard", 10);
        PremiumMembership premiumMember = new PremiumMembership("Bob", 12, true, true);

        standardMember.displayDetails();
        System.out.println();
        premiumMember.displayDetails();
    }
}
