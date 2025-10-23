package bank;

public class Account {
    private String name, accountNumber;
    private double balance;

    public Account(String name, String accountNumber, double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Successfully deposited: " + amount + ". Total Balance: "+ balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount){
        if (amount < balance){
            balance -= amount;
            System.out.println("Succesfully withdrawn: "+ amount + ". Total balance: "+ balance);
        } else {
            System.out.println("Withdraw amount invalid. Not enough funds.");
        }
    }

    @Override
    public String toString(){
        return "Account[ "+ accountNumber + ", " + name + ", Balance: "+ balance + " ]";
    }
}
