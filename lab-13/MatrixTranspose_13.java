package Samplepackage;
import java.util.Scanner;

public class MatrixTranspose_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking matrix dimensions from user
        int rows = 3;
        int cols = 4;

        // Creating the matrix
        int[][] matrix = new int[rows][cols];

        // Taking input for the matrix from the user
        System.out.println("Enter the elements of the matrix (3x4):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Printing the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Creating a transpose matrix
        int[][] transpose = new int[cols][rows];

        // Calculating the transpose
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Printing the transpose matrix
        System.out.println("Transpose of the Matrix:");
        printMatrix(transpose);

        scanner.close();
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
