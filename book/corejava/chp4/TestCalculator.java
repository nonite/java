import java.util.Scanner;
public class TestCalculator{
	public static void main(String args[]){
		int a = readInt();
		int b = readInt();

		printChoice();
		int choice = readInt();

		int result = calculate(a,b,choice);
		System.out.println(result);
	}

	public static int readInt(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input an integer:");
		int n = sc.nextInt();
		return n;
	}
	public static void printChoice(){
		System.out.println("1: +");
		System.out.println("2: -");
		System.out.println("3: *");
		System.out.println("4: /");
	}
	public static int calculate(int a, int b, int choice){
		switch(choice){
			case 1: return (a + b);
			case 2: return (a - b);
			case 3: return (a * b);
			case 4: return (a / b);
			default: return -1;
		}
	}
}