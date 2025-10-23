package bank;

import java.util.ArrayList;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account acc1 = new Account("Marconi", "10001", 12000);
        Account acc2 = new Account("Blaise Pascal", "10002", 300000);

        bank.addAccount(acc1);
        bank.addAccount(acc2);

        printAllAccounts(bank);

        bank.removeAccount("10002");

        printAllAccounts(bank);
    }

    public static void printAllAccounts(Bank bank){
        ArrayList<Account> accounts =  bank.showAllAccounts();

        for (Account acc : accounts){
            System.out.println(acc);
        }
    }
}
