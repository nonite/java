import java.util.Scanner;
public class TestBiggerThanTen{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n > 10) {
			System.out.println("statement 1");
			System.out.println("statement 2");
		}else{
			System.out.println("statement 3");
			System.out.println("statement 4");
		}
	}
}