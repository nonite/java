import java.util.Scanner;
public class TestAbs{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n < 0){
			n = -n;
		}
		System.out.println("Abs is " + n);
	}
}