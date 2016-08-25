//TestStudent.java
class Student{
	static{
		System.out.println("in Student static");
	}
	public Student(){
		System.out.println("Student()");
	}
}
public class TestStudent{
	public static void main(String args[]){
		Student stu1 = new Student();
		Student stu2 = new Student();
	}
}
