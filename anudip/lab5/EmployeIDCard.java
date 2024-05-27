package Samplepackage;

public class EmployeIDCard {
	    // Static variables (class-level)
	    static int number = 112244; // To generate unique employee IDs
	    static String companyName = "Anudip Foundation"; // Company name

	    // Instance variables
	    int eid;
	    String ename;

	    // Constructor to initialize employee details
	    EmployeIDCard(String ename) {
	        this.eid = number;
	        this.ename = ename;
	    }

	    // Static method to display employee details
	    static void displayEmployeeDetails(EmployeIDCard emp) {
	        System.out.println("Employee ID: " + emp.eid);
	        System.out.println("Employee Name: " + emp.ename);
	        System.out.println("Company Name: " + companyName);
	  
	    }

	    public static void main(String[] args) {
	        // Create employee objects
	        EmployeIDCard emp = new EmployeIDCard("Max Mayfield");

	        // Display employee details
	        displayEmployeeDetails(emp);
	    }
	}

