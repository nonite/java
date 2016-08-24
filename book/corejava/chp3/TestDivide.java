import java.util.Scanner;
public class TestDivide{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = 10;
		int b = sc.nextInt();
		if(b != 0){
			System.out.println(a/b);
		}else{
			System.out.println("b should not be 0");
		}
	}
}