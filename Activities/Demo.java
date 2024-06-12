package Activity;

public class Demo {
	
	  
	   void display(int number)
	   {
	    System.out.println(number);
	   }
	   void display(int num1, int num2)
	  {

	  System.out.println(num1+num2);
	  }

	   double display(double num)
	  {

	   return num;
	 }
	 }

	 class DemoMain{ 
	  public static void main(String[]args){
	  Demo obj=new Demo();
	 obj.display(8);
	 obj.display(8,8);
	 System.out.println(obj.display(9.0));


	 }
	 }



