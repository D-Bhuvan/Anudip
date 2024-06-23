package Samplepackage;

public class LargerSmallerArray {
	public static void main(String[] args) {// Scanner class within main method
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		int size = sc.nextInt();// declare and initializing array
		int a[] = new int[size];
		System.out.println("Enter the values of each index:");
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter value of a [" + i + "]");
			a[i] = sc.nextInt();// Assign values in side array
		}
		int larger = a[0];//larger to check max among array
		int smaller = a[0];//Smaller to check Min among array
		for (int i = 1; i < a.length; i++) {// for to check all No of array
			if (a[i] > larger) {
				larger = a[i];
			}
			if (a[i] < smaller) {
				smaller = a[i];
			}
		}
		System.out.println("THE larger No of Array is  " + larger + "   THE Smaller No of Array is   " + smaller);
	}
}

}
