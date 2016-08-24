public class TestInherit{
	public static void main(String args[]){
		C c = new C();
	}
}
class A{
	int valueA = 100;
	public A() {valueA = 150;}
}
class B extends A{
	int valueB = 200;
	public B(){valueB = 250;}
}
class C extends B{
	int valueC = 300;
	public C(){valueC = 350}
}