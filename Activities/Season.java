package Activity;
import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a month between jan to dec:");
		String month = scanner.nextLine().toLowerCase();
		switch (month) {
		
		case "november":
		case "december":
		case "january":
		case "februvary":
			System.out.println("winter seasnon");
			break;
		case "march":
		case "april":
		case "may":
		case "june":
			System.out.println("sumer season");
			break;
		case "july":
		case "august":
		case "september":
		case "october":
			System.out.println("this is a  rainy season");
			break;
		}
		scanner.close();
	}

}
