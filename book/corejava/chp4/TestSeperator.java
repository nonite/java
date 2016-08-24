public class  TestSeperator{
	public static void main(String args[]){
		System.out.println("Hello World");
		printSeperator(20);
		System.out.println("你好，世界");
		printSeperator(25);
		System.out.println("Bonjour tout le monde");
		printSeperator(30);
		System.out.println("Hallo Welt");
	}
	public static void printSeperator(int n){
		for(int i = 1; i<=n; i++){
			System.out.print("+");
		}
		System.out.println();
	}
}