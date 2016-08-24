public class TestMyClass{
	public static void main(String args[]){
		MyClass mc = new MyClass();
		System.out.println(mc.a);
		System.out.println(mc.b);

		System.out.println("Test this");
		mc.print();
	}
}
class MyClass{
	int a;
	int b = 100;
	public MyClass(){
		a = 20;
		b = 30;
	}
	int value = 10;
	public void print(){
		int value = 20;
		System.out.println(value);
		System.out.println(this.value);
	}
}