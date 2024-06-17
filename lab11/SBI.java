package Samplepackage;

import java.util.Scanner;
	interface Banking{
		public void deposit(double amount);
	    public void  withdraw( double amount);
	    public double  getBalance();
	}
	class Savings implements Banking{
		double balance;
		@Override
		public void deposit(double amount) {
			// TODO Auto-generated method stub
			 balance=balance+amount;
		        System.out.println("Deposit of" + amount );
		}

		@Override
		public void withdraw( double amount) {
			// TODO Auto-generated method stub
			 if (balance >= amount) {
		            balance=balance-amount;
		            System.out.println("Withdrawal" + amount );
		        } else {
		            System.out.println("Insufficient balance");
		        }
		}

		@Override
		public double getBalance() {
			// TODO Auto-generated method stub
			return balance;
		}
		
	}
	class Current implements Banking{
	    double balance;
		@Override
		public void deposit(double amount) {
			// TODO Auto-generated method stub
			 balance=balance+amount;
		        System.out.println("Deposit of" + amount );
		}

		@Override
		public void withdraw(double amount) {
			// TODO Auto-generated method stub
			 if (balance >= amount) {
		            balance=balance-amount;
		            System.out.println("Withdrawal" + amount );
		        } else {
		            System.out.println("Insufficient balance");
		        }
		}

		@Override
		public double getBalance() {
			// TODO Auto-generated method stub
			return balance;
			
		}
		
	}


	public class SBI {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc= new Scanner(System.in);
			Savings s = new Savings();
			Current c = new Current();
			  System.out.print("Enter deposit amount for savings account: ");
		        double depositAmount = sc.nextDouble();
		        s.deposit(depositAmount);
		        
		      
		        System.out.print("Enter deposit amount for Current account: ");
		        depositAmount = sc.nextDouble();
		        c.deposit(depositAmount);
		        
		        
		        System.out.print("Enter withdrawal amount from savings account: ");
		        double withdraw = sc.nextDouble();
		        s.withdraw(withdraw);
		        
		        System.out.print("Enter withdrawal amount from Current account: ");
		        double withdraw1= sc.nextDouble();
		        c.withdraw(withdraw1);
		        System.out.println("Savings Account Balance:" + s.getBalance());
		        
		        
		        System.out.println("Current Account Balance:" + c.getBalance());
		        
		        sc.close();

		}

	}


