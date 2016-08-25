public class TestArraySort{
	public static void main(String args[]){
		int a[] = {1,7,2,5,3};
		printArray(a);

		java.util.Arrays.sort(a);
		printArray(a);
	}
	public static void printArray(int a[]){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}