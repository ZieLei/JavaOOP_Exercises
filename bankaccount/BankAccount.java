package bankaccount;

public class BankAccount {
    private String accountNumber, accountName;
    private double balance;

    public BankAccount(String accountNumber, String accountName, double balance){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("Amount is higher than your current balance of: " + balance);
            return;
        }

        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
