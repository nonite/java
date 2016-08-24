public class TestParameter{
	public static void main(String args[]){
		int a = 10;
		int b = changeInt(a);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	public static int changeInt(int n){
		n++;
		return n;
	}
}