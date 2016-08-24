import java.util.Scanner;
public class TestSwitch{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch(n){
			case 1:
				System.out.println("Congratulations, nice score");
				System.out.println("90 ~ 100");
				break;
			case 2:
				System.out.println("80 ~ 89");
				break;
			case 3:
				System.out.println("70 ~ 79");
				break;
			case 4:
				System.out.println("60 ~ 69");
				break;
			case 5:
				System.out.println("0 ~ 59");
				System.out.println("Please work harder");
				break;
			default:
				System.out.println("Input error");
				break;
		}
	}
}