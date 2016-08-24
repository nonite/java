public class TestMultiArray{
	public static void main(String args[]){
		int[][] a = new int[3][4];
		printMultiArray(a);
		
		int[][] b = new int[3][];
		b[0] = new int[3];
		b[1] = new int[4];
		b[2] = new int[5];
		printMultiArray(b);
	}
	public static void printMultiArray(int[][] a){
		for(int i = 0; i <a.length; i++){
			for(int j = 0; j<a[i].length;j++){
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}