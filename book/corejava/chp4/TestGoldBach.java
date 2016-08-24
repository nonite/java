import java.util.Scanner;
public class TestGoldBach{
	public static void main(String args[]){
		//input an integer
		System.out.println("Please input an integer: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		//loop to determin
		for(int i = 1; i <= n/2; i++){
			int a = i;
			int b = n-i;
			if(isPrime(a) && isPrime(b)){
				System.out.println(n + "=" + a + "+" + b);
			}
		}

	}
	//determin if it's a prime number
	public static boolean isPrime(int a){
		for(int i = 2; i<=(a-1); i++){
			if(a % i == 0) return false;
		}
		return true;
	}
}