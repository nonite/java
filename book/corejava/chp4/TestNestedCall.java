public class TestNestedCall{
	public static void main(String args[]){
		System.out.println("main1");
		ma();
		System.out.println("main2");
	}
	public static void ma(){
		System.out.println("ma1");
		mb();
		System.out.println("ma2");
	}
	public static void mb(){
		System.out.println("mb1");
		System.out.println("mb2");
	}
}