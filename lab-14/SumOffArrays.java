package Samplepackage;
import java.util.Scanner;
public class SumOffArrays {
	public static void main(String[] args) {// Scanner class within main method
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		int size = sc.nextInt();// declare and initializing array
		int a[] = new int[size];
		System.out.println("Enter the values of each index:");
		int sum = 0; // sum variable used to sum of array
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter value of a [" + i + "]");
			a[i] = sc.nextInt();// Assign values in side array
			sum += a[i];
		}
		System.out.println("Therefore the sum of Arrayis:" + sum);
	}

}


