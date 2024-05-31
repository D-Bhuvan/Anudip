package Samplepackage;

public class LeapYearCheck {

	    // Function to check if a year is a leap year
	    public static boolean isLeapYear(int year) {
	        // A year is a leap year if it is divisible by 4,
	        // but centuries (years divisible by 100) are not leap years unless
	        // they are also divisible by 400.
	        if (year % 400 == 0) {
	            return true;
	        } else if (year % 100 == 0) {
	            return false;
	        } else if (year % 4 == 0) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public static void main(String[] args) {
	        int year = 2024; // Example year to check
	        
	        // Check if the year is a leap year
	        if (isLeapYear(year)) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }
	 }
}