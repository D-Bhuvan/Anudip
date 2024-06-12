package Samplepackage;

import java.util.Scanner;

abstract class Shape {
    abstract double calculation();
}
class Rectangle extends Shape{
	double length;
    double breath;
    Rectangle(double length,double breath){
    	this.length=length;
    	this.breath=breath;
    }
	@Override
	double calculation() {
		// TODO Auto-generated method stub
		return length*breath;
	}
	
}
class Circle extends Shape{
      double radius;
      Circle(double radius) {
          this.radius = radius;
      }
	@Override
	double calculation() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}
	
}
public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc = new Scanner(System.in);
		  System.out.println("Choose shape to calculate area (Rectangle/Circle):");
	        String choice = sc.nextLine().toLowerCase();
	        switch (choice) {
            case "rectangle":
                System.out.println("Enter length:");
                double length = sc.nextDouble();
                System.out.println("Enter breath:");
                double breath = sc.nextDouble();
                Rectangle a= new Rectangle(length, breath);
                System.out.println("Area of Rectangle: " +a.calculation());
                break;
            case "circle":
                System.out.println("Enter radius:");
                double radius = sc.nextDouble();
                Circle b = new Circle(radius);
                System.out.println("Area of Circle: " + b.calculation());
                break;
            default:
                System.out.println("Enter valid choice!");
                break;
        }
	}
}
