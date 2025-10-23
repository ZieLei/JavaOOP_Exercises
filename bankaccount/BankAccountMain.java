package bankaccount;

public class BankAccountMain {
    public static void main(String[] args) {
        SavingsAccount mySavings = new SavingsAccount("12345", "Alice", 1000, 0.05);
        mySavings.deposit(500);
        mySavings.applyInterest();
        System.out.println(mySavings.getBalance());
    }
}
