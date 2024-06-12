package Activity;

public class Student {
	String stdName;
	int RollNo;
	String Grade;
 public Student(String stdName,int RollNo,String Grade) {
	this.stdName =stdName;
	this.RollNo = RollNo;
	this.Grade = Grade;
}
  void studentDetails() {
	  System.out.println(stdName+" "+RollNo+" "+Grade);
  }
static class SchoolManagement{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("bhuvan",403,"A1");
		s1.studentDetails();
		Student s2 = new Student("sampath",411,"A1");
		s2.studentDetails();
		
		

	}
	}

}
