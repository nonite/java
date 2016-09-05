class MyOuterClass{
	private int value = 100;
	public void setValue(int value){
		this.value = value;
	}
	public int getValue(){
		return value;
	}
	class InnerClass{
		public void m(){
			System.out.println(value);
		}
	}
	public void f(){
		InnerClass ic = new InnerClass();
		ic.m();
	}
}
public class TestInnerClassII{
	public static void main(String args[]){
		MyOuterClass moc = new MyOuterClass();
		MyOuterClass.InnerClass ic = moc.new InnerClass();
		ic.m();
	}
}