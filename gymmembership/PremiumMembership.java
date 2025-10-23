package gymmembership;

public class PremiumMembership extends GymMembership {
    private boolean personalTrainer;
    private boolean spaAccess;

    public PremiumMembership(String memberName, int duration, boolean personalTrainer, boolean spaAccess) {
        super(memberName, "Premium", duration);
        this.personalTrainer = personalTrainer;
        this.spaAccess = spaAccess;
    }

    @Override
    public double calculateFees() {
        double baseFee = super.calculateFees();
        if (personalTrainer) baseFee += 100 * super.calculateFees()/super.calculateFees(); 
        if (spaAccess) baseFee += 50 * super.calculateFees()/super.calculateFees(); 
        return baseFee;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Personal Trainer: " + (personalTrainer ? "Available" : "Not Available"));
        System.out.println("Spa Access: " + (spaAccess ? "Available" : "Not Available"));
    }
}