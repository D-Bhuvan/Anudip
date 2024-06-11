package Samplepackage;
import java.util.Scanner;
class BankAccount {
    private String accountType;
    private double balance;

    public BankAccount(String accountType) {
        this.accountType = accountType;
        this.balance = 0.0;
    }

    public BankAccount(String accountType, double initialBalance) {
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
    }

    public void depositByCash(double cashAmount) {
        deposit(cashAmount);
    }

    public void depositByCheque(double chequeAmount) {
        deposit(chequeAmount);
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Rs " + amount + " from your " + accountType + " account.");
        } else {
            System.out.println("Insufficient Funds.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount savingsAccount = new BankAccount("Savings");

        savingsAccount.depositByCash(1500.0);

        savingsAccount.depositByCheque(1000.0);

        savingsAccount.withdraw(2000.0);

        System.out.println("Savings account balance: Rs " + savingsAccount.getBalance());

        BankAccount checkingAccount = new BankAccount("Checking", 2000.0);

        checkingAccount.withdraw(1000.0);

        System.out.println("Checking balance: Rs " + checkingAccount.getBalance());

        scanner.close();
    }
}  		    