interface IA{
	void ma();
}
interface IB{
	void mb();
}
interface IC extends IA, IB{
	void mc();
}
interface ID{
	void md();
}
abstract class ClassE{
	public abstract void me();
}

class MyImpl extends ClassE implements IC, ID{
	public void ma(){}
	public void mb(){}
	public void mc(){}
	public void md(){}
	public void me(){}
}
public class TestMyImpl{
	public static void main(String args[]){
		IA ia = new MyImpl();
		System.out.println(ia instanceof IA);
		System.out.println(ia instanceof IB);
		System.out.println(ia instanceof IC);
		System.out.println(ia instanceof ID);
		System.out.println(ia instanceof ClassE);
		System.out.println(ia instanceof MyImpl);
	}
}