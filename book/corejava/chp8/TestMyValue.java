class MyValue{
	int value;
}
public class TestMyValue{
	public static void main(String args[]){
		final MyValue MV;
		//MyValue MV;
		MV = new MyValue();
		MV.value = 10;
		MV.value = 100;
		MV = new MyValue();
	}
}