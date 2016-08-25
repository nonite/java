abstract class MyAbstract{
	public void m(){}
}
class MySubClass extends MyAbstract{

}
public class TestAbstract1{
	public static void main(String args[]){
		MyAbstract ma;
		//ma = new MyAbstract();
		ma = new MySubClass();
	}
}