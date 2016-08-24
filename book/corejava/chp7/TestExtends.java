class Animal{
	int age;
	boolean sex;
	public void eat(){
		System.out.println("Animal eat");	
	}
	public void sleep(){
		System.out.println("sleep 8 hours");
	}
}

class Dog extends Animal{
	public void lookAfterHouse(){
		System.out.println("look after house");
	}
	public void sleep(){
		System.out.println("sleep 6 hours");
	}
}
class Cat extends Animal{
	public void catchMouse(){
		System.out.println("catch mouse");
	}
}
public class TestExtends{
	public static void main(String args[]){
		Dog d = new Dog();
		d.sex = true;
		d.age = 3;
		d.eat();
		d.lookAfterHouse();
		d.sleep();
	}
}