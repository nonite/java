public class TestPrivateMethod{
	public static void main(String args[]){
		MyClass mc = new MyClass();
		mc.method1();
		mc.method2();
	}
}
class MyClass{
	public void method1(){};
	private void method2(){};
}