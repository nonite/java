import java.util.Scanner;
public class TestVoid{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number: ");
		int a = sc.nextInt();
		printHelloWorld(a);
	}
	public static void printHelloWorld(int n){
		if(n > 10) return;
		for(int i = 0; i < n; i++){
			System.out.println(i + "Hello World");
		}
	}
}