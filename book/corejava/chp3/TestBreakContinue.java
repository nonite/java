public class TestBreakContinue{
	public static void main(String args[]){
		outer:for(int i = 1; i <=3; i++){
			inner:for(int j = 1; j <= 4; j++){
				if(j == 3) continue outer;
				System.out.println("i=" + i + "j=" + j);
			}
		}
	}
}