class MyOuterClass{
	private int value = 100;
	private class InnerClass{
		public void m(){
			System.out.println(value);
		}
	}
	public void f(){
		InnerClass ic = new InnerClass();
		ic.m();
	}
}
public class TestInnerClass{
	public static void main(String args[]){
		MyOuterClass moc = new MyOuterClass();
		moc.f();
	}
}