package Activity;
import java.util.Scanner;
public class TrafficLights {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a traffic light color- Red, Yellow or Green");
		String color = scanner.nextLine().toUpperCase();
		
		switch (color) {
		  case "RED":
			  System.out.println("Stop! the light is red.");
			  break;
		  case "YELLOW":
			  System.out.println("slow down! you need to stop! YELLOW");
			  break;
		  case "GREEN":
			  System.out.println("you can go on! THe light is green");
			  break;
		 default:
			 System.out.println("invalid input, plesse input a valid colour");
			 
		}
      scanner.close();
	}

}
