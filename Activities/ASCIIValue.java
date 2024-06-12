package Activity;
import java.util.Scanner;
public class ASCIIValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a charecter: ");
		char inputChar = sc.next().charAt(0);
		int asciiValue =(int) inputChar;
		System.out.println("ASCII value of"+" "+inputChar+" "+"is"+asciiValue);
		sc.close();
		

	}

}
