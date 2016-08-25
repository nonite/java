class Super{
	public void m1(){
		System.out.println("m1 in super");
	}
	public static void m2(){
		System.out.println("m2 in super");
	}
}
class Sub1 extends Super{
	public void m1(){
		System.out.println("m1 in Sub1");
	}
	public static void m2(){
		System.out.println("m2 in Sub1");
	}
}
public class TestStaticOverride{
	public static void main(String args[]){
		Super sup = new Sub1();
		sup.m1();
		sup.m2();

		Sub1 sub = (Sub1) sup;
		sub.m1();
		sub.m2();
	}
}