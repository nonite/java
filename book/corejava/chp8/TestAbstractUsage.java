abstract class Shape{
	abstract public double girth();
	abstract public double area();
}
class Circle extends Shape{
	private double r;
	private static final double PI = 3.1415926;
	public Circle(double r){
		this.r = r;
	}
	public double girth(){
		return 2*PI*r;
	}
	public double area(){
		return PI*r*r;
	}
}
class Rect extends Shape{
	private double a;
	private double b;
	public Rect(double a, double b){
		this.a = a;
		this.b = b;
	}
	public double girth(){
		return 2*(a+b);
	}
	public double area(){
		return a*b;
	}
}
public class TestAbstractUsage{
	public static void main(String args[]){
		Circle c = new Circle(3);
		Rect r = new Rect(2,5);
		System.out.println("The area of Circle is "+c.area());
		System.out.println("The girth of Circle is "+c.girth());
		System.out.println("The area of Rect is "+r.area());
		System.out.println("The girth of Rect is "+r.girth());
	}
}