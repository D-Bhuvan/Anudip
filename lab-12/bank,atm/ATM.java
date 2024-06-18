package atm;
import bank.BankAccount;

public class ATM {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("123456", 500.0, "Vamc");
        a1.deposit(100);
        a1.withdraw(50);
        a1.display();
        SavingsAccount a2 = new SavingsAccount("12345", 900, "VAMC");
        a2.showBalance();
    }
}
class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance, String ownerName) {
        super(accountNumber, balance, ownerName);
    }

    public void showBalance() {
        System.out.println("Current Balance (protected access):" + balance);
    }
} 