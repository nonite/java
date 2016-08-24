public class TestArrayExpand{
	public static void main(String args[]){
		int[] a = {10, 20, 30};
		printArray(a);

		a = expand(a);
		printArray(a);
	}
	public static int[] expand(int[] a ){
		int[] newArray = new int[a.length*2];
		for(int i = 0; i<a.length;i++){
			newArray[i] = a[i];
		}
		return newArray;
	}
	public static void printArray(int[] n){
		for(int i = 0; i<n.length;i++)
			System.out.print(n[i] + "\t");
		System.out.println();
	}
}