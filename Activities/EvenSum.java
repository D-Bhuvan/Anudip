package Activity;
import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the sum upto where you want the sum");
		int limit = scanner.nextInt();
		int sum = 0;
		for (int i=2; i<= limit; i +=2) {
			sum +=i;
		}
		System.out.println("Sum of Even Numbers from 1 to "+ limit + "=" + sum);
		scanner.close();

		}

	}


