class Student implements Comparable<Student>{
	int age;
	String name;
	public Student(){
	}
	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public int compareTo(Student stu){
		if(this.age > stu.age){
			return 1;
		}else if(this.age < stu.age){
			return -1;
		}else{
			return 0;
		}
	}
}
public class TestTreeSet{
	public static void main(String args[]){
		
	}
}