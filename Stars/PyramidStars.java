package practice;
public class PyramidStars {

    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pyramid

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
        	// Inner loop 1: for spaces
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" "); // Print spaces
                }

                // Inner loop 2: for stars
                int numStars =2*i - 1; // Calculate number of stars for this row
                for (int k = 1; k <= numStars; k++) {
                    System.out.print("*"); // Print stars
                }

                // Move to the next line after each row
                System.out.println();
            }
        }
    }

