public class TestBubbleSort{
	public static void main(String args[]){
		int[] a = {7, 5, 1, 3, 2};
		System.out.println("Before Sort:");
		printArray(a);

		for(int i = 0; i<(a.length-1);i++){
			for(int j = 0;j<(a.length-i-1); j++){
				if(a[j] > a[j+1]){
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}

		System.out.println("After Sort:");
		printArray(a);
	}
	public static void printArray(int[] n){
		for(int i = 0; i<n.length;i++)
			System.out.print(n[i] + "\t");
		System.out.println();
	}
}