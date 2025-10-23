package bank;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank(){
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account){
        accounts.add(account);
        System.out.println("Account: " + account.getName() + " added!");
    }

    public void removeAccount(String accountNumber){
        accounts.removeIf(acc -> acc.getAccountNumber().equals(accountNumber));
        System.out.println("Account removed: " + accountNumber);
    }

    public ArrayList<Account> showAllAccounts(){
        return accounts;
    }
}
