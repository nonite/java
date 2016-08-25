class Animal{
	public void eat(){
		System.out.println("Animal eat");
	}
	public void sleep(){
		System.out.println("Animal sleep 8 hours");
	}
}
class Dog extends Animal{
	public void sleep(){
		System.out.println("Dog sleep 6 hours");
	}
	public void lookAfterHouse(){
		System.out.println("Dog can look after house");
	}
}
class Cat extends Animal{
	public void sleep(){
		System.out.println("Cat sleep 7 hours");
	}
	public void catchMouse(){
		System.out.println("catch mouse");
	}
}
class Feeder{
	public void feed(Dog d){
		d.eat();
	}
	public void feed(Cat c){
		c.eat();
	}
	public void feed(Animal a){
		a.eat();
	}
}
public class TestPolymorphism{
	public static void main(String args[]){
		Animal a = new Dog();
		a.eat();
		a.sleep();
		//a.lookAfterHouse();

		Feeder f = new Feeder();
		Dog d = new Dog();
		f.feed(d);
		Cat c = new Cat();
		f.feed(c);

		//start of 3.4
		//Dog d = new Dog();
		System.out.println("3.4");
		m1(d);

		Animal aa = m2(5);
		aa.sleep();
	}
	static void m1(Animal a){
		a.sleep();
	}
	static Animal m2(int i){
		if(i % 2 ==0){
			return new Dog();
		}else{
			return new Cat();
		}
	}
	//end of 3.4
}