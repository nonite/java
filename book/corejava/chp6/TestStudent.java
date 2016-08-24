public class TestStudent{
	public static void main(String args[]){
		Student stu = new Student();
		System.out.println(stu.age);

		stu.study();
		stu.study(10);

		MyClass mc = new MyClass();
		mc.print();

		System.out.println("Try constructor:");
		Student stu1 = new Student();
		Student stu2 = new Student(10);
		Student stu3 = new Student("Tom",18);
	}
}
class Student{
	int age;
	String name;
	public void study(){
		System.out.println("Students study for 8 hours");
	}
	public void study(int n){
		System.out.println("study for " + n +" hours");
	}
	public Student(){
		System.out.println("Student()");
	}
	public Student(int n){
		System.out.println("Student(int)");
	}
	public Student(String stuName, int stuAge){
		name = stuName;
		age = stuAge;
	}
}
class MyClass{
	public void print(){
		int value = 20;
		System.out.println(value);
	}
	int value = 10;
}