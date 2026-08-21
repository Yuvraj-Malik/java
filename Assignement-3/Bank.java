import java.util.*;

class BankAccount{
    int accountNumber;
    String holderName;
    double balance;

    BankAccount(int number, String name, double bal){
        accountNumber = number;
        holderName = name;
        balance = bal;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        balance = balance - amount;
    }

    public double calculateInterest(){
        return 0;
    }

    public void displayAccountDetails(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount{
    double interestRate;

    SavingsAccount(int number, String name, double bal){
        super(number, name, bal);
        interestRate = 6;
    }

    public double calculateInterest(){
        return balance * interestRate / 100;
    }

    public void displayAccountDetails(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
    }
}

class CurrentAccount extends BankAccount{
    double interestRate;

    CurrentAccount(int number, String name, double bal){
        super(number, name, bal);
        interestRate = 3;
    }

    public double calculateInterest(){
        return balance * interestRate / 100;
    }

    public void displayAccountDetails(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
    }
}

public class Bank{
    public static void main(String args[]){
        BankAccount account1 = new SavingsAccount(101, "Lakshit", 10000);
        BankAccount account2 = new CurrentAccount(102, "Manavjit", 20000);

        account1.deposit(1000);
        account2.withdraw(2000);

        account1.displayAccountDetails();
        account2.displayAccountDetails();
    }
}