package Activity;
import java.util.*;
public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Radius of the circle: ");
		double radius = sc.nextDouble();
		double area =Math.PI * radius * radius ;
		System.out.println("The area of circle is : " +area);
		
	}

}
