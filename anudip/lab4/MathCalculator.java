package Samplepackage;
import java.util.Scanner;
public class MathCalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();
	        // Perform calculations
	        int add = num1 + num2;
	        int subtract = num1 - num2;
	        int multiply = num1 * num2;
	        int divide = num1 / num2;
	        // Display results
	        System.out.println("Addition: " + add);
	        System.out.println("Subtraction: " + subtract);
	        System.out.println("Multiplication: " + multiply);
	        System.out.println("Division: " + divide);

	        scanner.close();
	    }
}

