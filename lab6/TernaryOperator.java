
package Samplepackage;
import java.util.Scanner;
public class TernaryOperator {
	public static void main(String[] args) 
	{
		int p,q,r;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the three numbers: ");
		p = scanner.nextInt();
		q = scanner.nextInt();
		r = scanner.nextInt();
		int large = (p > q) ? ((p > r) ? p : r) : ((q > r) ? q : r);
		System.out.println("The Largest number is: " + large );
	 }
}

