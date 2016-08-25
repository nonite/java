abstract class MyAbstract{
	public abstract void m1();
	public void m2(){}
}
class MySubClass extends MyAbstract{
	public void m1(){
		System.out.println("In SubClass");
	}
}
public class TestAbstract{
	public static void main(String args[]){
		MyAbstract ma = new MySubClass();
		ma.m1();
	}
}