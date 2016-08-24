import java.util.Scanner;
public class TestFactorial{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input an integar");
		int n = sc.nextInt();
		int a = factorial(n);
		System.out.println(n + "! = " + a);
	}
	public static int factorial(int n){
		if(n == 1) return 1;
		int result = factorial(n-1);
		return n*result;
	}
}