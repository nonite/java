import java.util.Scanner;
public class TestScanner{
	//public static void main(String args[]){
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Please input a string: ");
		String str = sc.nextLine();
		System.out.println("Got " + str);

		System.out.print("Please input an int: ");
		int n = sc.nextInt();

		System.out.print("Please input a double: "); 
		double d = sc.nextDouble();

		System.out.println(n * d);
	}
}