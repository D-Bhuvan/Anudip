package Samplepackage;



public class Private {
         private int a =20;
         private void method() {
        	 System.out.println("From Private Method");
         }
         private void talk() {
        	 System.out.println("ALWAYS TALKING");
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Private p = new Private();
          p.method();
          p.talk();
          System.out.println(p.a);
	}

}