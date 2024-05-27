package Samplepackage;
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

         {
            System.out.print("Enter 'YES' to the area of a circle: ");
            userInput = scanner.nextLine().trim().toUpperCase();

            if (userInput.equals("YES")) {
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double area = Math.PI * Math.pow(radius, 2);
                System.out.println("Area of the circle with radius " + radius + " units: " + area);
            }
        }
    }
}