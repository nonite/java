import java.util.*;

class Student{
	private int age;
	private String name;

	public Student(){
	}

	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String toString(){
		return name + " " + age;
	}
	public int hashCode(){
		return age + name.hashCode();
	}
	public boolean equals(Object obj){
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Student stu = (Student) obj;
		if(this.age == stu.age && this.name.equals(stu.name)){
			return true;
		}else {
			return false;
		}
	}
}
public class TestStudent{
	public static void main(String args[]){
		Set set = new HashSet();
		/*
		Student stu1 = new Student("Tom", 18);
		Student stu2 = new Student("Tom", 18);
		System.out.println(stu1.hashCode());
		System.out.println(stu2.hashCode());
		set.add(stu1);
		set.add(stu2);
		System.out.println(set.size());
		*/
		set.add(new Student("Tom", 18));
		set.add(new Student("Jim", 20));
		set.add(new Student("Fred", 22));
		set.add(new Student("Tom", 18));

		Iterator iter = set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
}