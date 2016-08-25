interface Teacher{
	void teach();
}
class CoreJavaTeacher implements Teacher{
	public void teach(){
		System.out.println("teach corejava");
	}
}
class JavaWebTeacher implements Teacher{
	public void teach(){
		System.out.println("teach java web");
	}
}
public class TestTeacher{
	public static void main(String args[]){
		Teacher t = getTeacher(0);
		beginClass(t);
	}
	public static Teacher getTeacher(int type){
		if(type == 0)
			return new CoreJavaTeacher();
		else
			return new JavaWebTeacher();
	}
	public static void beginClass(Teacher t){
		t.teach();
	}
}