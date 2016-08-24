class Parent{
	public void m(){
		System.out.println("m in Parent");
	}
}
class Child extends Parent{
	public void m(){
		System.out.println("m in Child");
	}
	public void m1(){
		this.m();
	}
	public void m2(){
		super.m();
	}
}
public class TestSuper{
	public static void main(String args[]){
		Child c = new Child();
		c.m1();
		c.m2();
	}
}