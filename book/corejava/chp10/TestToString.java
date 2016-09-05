class Student{
	String name;
	int age;
	public Student(){}
	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return name + " " + age;
	}
}
public class TestToString{
	public static void main(String args[]){
		Student stu = new Student("Tom", 18);
		System.out.println(stu.toString());
		System.out.println(stu);

		String str = "My string " + stu;
		System.out.println(str);
	}
}