class MyValue{
	int a;
	static int b;
}
public class TestStatic{
	public static void main(String args[]){
	/*	MyValue.b = 800;
		MyValue mv1 = new MyValue();
		MyValue mv2 = new MyValue();
		mv1.a = 100;
		//mv1.b = 200;
		mv2.a = 300;
		//mv2.b = 400;
		//MyValue.b = 500;
		System.out.println(mv1.a);
		System.out.println(mv1.b);
		System.out.println(mv2.a);
		System.out.println(mv2.b);
		System.out.println(MyValue.b);
    */

		int a = 10;
		static int b =20;
		public void ma(){}
		public static void mb(){}

		public void fa(){
			System.out.println(a);
			System.out.println(b);
			ma();
			mb();
		}
		public static void fb(){
			System.out.println(a);
			System.out.println(b);
			ma();
			mb();
		}

	}
}