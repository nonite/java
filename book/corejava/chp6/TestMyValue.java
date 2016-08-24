public class TestMyValue{
	public static void main(String args[]){
		MyValue mv1 = new MyValue();
		mv1.value = 100;
		MyValue mv2 = mv1;
		mv2.value = 200;
		System.out.println(mv1.value);

		int a = 10;
		changeInt(a);
		System.out.println(a);

		MyValue m = new MyValue();
		m.value = 10;
		changeObject(m);
		System.out.println(m.value);
	}
	public static void changeInt(int n){
		n++;
	}
	public stativ void changeObject(MyValue mv){
		mv.value++;
	}
}
class MyValue{
	int value;
}