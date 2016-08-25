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
public class TestInstanceof{
	public static void main(String args[]){
		Animal a = new Cat();
		System.out.println(a instanceof Cat);
		System.out.println(a instanceof Dog);
		System.out.println(a instanceof Animal);
	}
}