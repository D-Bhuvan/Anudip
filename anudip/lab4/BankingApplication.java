package Samplepackage;
import java.util.Scanner;
public class BankingApplication {
    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double balance = 0.0;

	        System.out.println("Welcome to the Banking Application!");

	        while (true) {
	            System.out.println("\nChoose an option:");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Current Balance");	           
	            System.out.print("Enter your choice (1/2/3): ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter the amount to deposit: ");
	                    int depositAmount = scanner.nextInt();
	                    balance += depositAmount;
	                    System.out.println("Deposit successful!");
	                    break;
	                case 2:
	                    System.out.print("Enter the amount to withdraw: ");
	                    int withdrawAmount = scanner.nextInt();
	                    if (withdrawAmount <= balance) {
	                        balance -= withdrawAmount;
	                        System.out.println("Withdrawal successful!");
	                    } else {
	                        System.out.println("Insufficient balance!");
	                    }
	                    break;
	                case 3:
	                    System.out.println("Current balance: " + balance);
	                    break;
	                case 4:
	                    System.out.println("Thank you for using the Banking Application!");
	                    scanner.close();
	            }
	        }
	    }
}