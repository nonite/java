class Parent{
	public Parent(){
		System.out.println("Parent()");
	}
	public Parent(String str){
		System.out.println("Parent(String)");
	}
}
class Child extends Parent{
	public Child(String str){
		super(str);
		System.out.println("Child(String)");
	}
}
public class TestInheritConstructor{
	public static void main(String args[]){
		Child c = new Child("Hello");
	}
}