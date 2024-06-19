package Samplepackage;

public class AdditionOfOdd {
	
	

	public static void main(String[] args) {
		// Addition of Two positive odd numbers LAB 13
		
		int a[][] = {{1,1,1},{5,5,5},{3,3,3}};//matrix a 3X3
		int b[][] = {{1,1,1},{5,5,5},{3,3,3}};//matrix b 3X3
		int c[][] = new int[3][3]; //for addition
		
		
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++)
			{
				System.out.print(a[i][j]); //prints a matrix
				
			}
			System.out.println(); // new line for each
		}
		System.out.println(); //Extra space for op better understanding
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(b[i][j]); //prints b matrix
			}
			System.out.println();
		}
		System.out.println(); //Extra space for op better understanding
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				c[i][j]=0;
				c[i][j]=a[i][j]+b[i][j]; //Addition of two matrix
				System.out.print(c[i][j]); //printing o/p
			}
			System.out.println();
		}
		
		

	}

}
