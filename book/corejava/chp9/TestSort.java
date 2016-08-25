class Student implements Comparable<Student>{
	int age;
	String name;
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
public class TestSort{
	public static void main(String args[]){
		Student ss[] = new Student[3];
		ss[0] = new Student("Tom", 18);
		ss[1] = new Student("Jim", 17);
		ss[2] = new Student("Jerry", 20);
		java.util.Arrays.sort(ss);
		for(int i = 0; i < ss.length; i++){
			System.out.println(ss[i].name + "" +ss[i].age);
		}
	}
}