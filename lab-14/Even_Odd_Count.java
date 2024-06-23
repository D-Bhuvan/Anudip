package Samplepackage;import java.util.Scanner;

public class Even_Odd_Count {

	public static void main(String[] args) {//Scanner class within main method
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		int size = sc.nextInt();// declare and initializing array
		int a[] = new int[size];
		System.out.println("Enter the values of each index:");
		int evenc=0,oddc=0;// 2 variables used to count No off even/odd 
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter value of a [" + i + "]");
			a[i] = sc.nextInt();// Assign values in side array
			if (a[i]%2==0) {
				evenc++;
			} else {
			    oddc++;		
			}
		}
		System.out.println("THE TOTAL No of even are"+evenc+"THE TOTAl No of Odd are"+oddc);
	}

}