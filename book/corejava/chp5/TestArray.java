public class TestArray{
	public static void main(String args[]){
		int[] a = new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		printArray(a);
	}
	public static void printArray(int[] n){
		for(int i = 0; i<n.length;i++)
			System.out.print(n[i] + "\t");
		System.out.println();
	}
}