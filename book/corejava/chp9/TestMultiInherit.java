/*
abstract class MyAbstractClass{
	public static final int VALUE1 = 100;
	public static final int VALUE2 = 200;
	public abstract void m1();
	public abstract void m2(int n);
}
class MySubClass extends MyAbstractClass{
	public void m1(){}
	public void m2(int n){}
}
*/
interface MyInterface{
	int VALUE1 = 100;
	int VALUE2 = 200;
	void m1();
	void m2(int n);
}
class MyImpl implements MyInterface{
	public void m1(){}
	public void m2(int n){}
}