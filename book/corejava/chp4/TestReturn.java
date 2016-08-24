public class TestReturn{
	public static void main(String args[]){
		m(10);
	}
	public static int m(int arg){
		System.out.println("m()");
		if(arg == 10) return 0;
		else return 1;
	}
}