package Samplepackage;

import java.util.Scanner;

	public class PalindromeCheck {
	    // Function to check if a number is a palindrome
	    public static boolean isPalindrome(int num) {
	        int originalNum = num;
	        int reversedNum = 0;

	        while (num > 0) {
	            int digit = num % 10;
	            reversedNum = reversedNum * 10 + digit;
	            num /= 10;
	        }

	        return originalNum == reversedNum;
	    }

	    public static void main(String[] args) {
	        Scanner Scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int inputNumber = Scanner.nextInt();

	        if (isPalindrome(inputNumber)) {
	            System.out.println(inputNumber + " is a palindrome.");
	        } else {
	            System.out.println(inputNumber + " is not a palindrome.");
	        }
	    }
	}