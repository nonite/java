public class TestFunction{
	public static void main(String args[]){
		System.out.println("Line 3");
		int m = 10, n = 20;
		int result = add(m,n);
		System.out.println(result);
		System.out.println("Line 7");
		add(10,20);
		System.out.println("Line 9");
	}
	public static int add(int a, int b){
		System.out.println("Line 12");
		int c = a + b;
		System.out.println("Line 14");
		return c;
	}
}