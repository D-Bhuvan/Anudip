package Activity;


	class A
	{

	  void display()
	 {
	  System.out.println("Class A");
	 }

	}


	class B extends A
	{

	  void display()
	  {
	   System.out.println("class B");
	 }
	}

	public class Parameter
	{
	 public static void main(String[] args)
	 {
	   B obj=new B();
	   obj.display();

	  A obj1=new A();
	  obj1.display();


	}
	}


