interface Bulb{
	void shine();
}
class RedBulb implements Bulb{
	public void shine(){
		System.out.println("Shine in Red");
	}
}
class YellowBulb implements Bulb{
	public void shine(){
		System.out.println("Shine in Yellow");
	}
}
class GreenBulb implements Bulb{
	public void shine(){
		System.out.println("Shine in Green");
	}
}
class Lamp{
	private Bulb bulb;
	public void setBulb(Bulb bulb){
		this.bulb = bulb;
	}
	public void on(){
		bulb.shine();
	}
}
public class TestLamp{
	public static void main(String args[]){
		Lamp lamp = new Lamp();
		Bulb b1 = new RedBulb();
		lamp.setBulb(b1);
		lamp.on();

		Bulb b2 = new GreenBulb();
		lamp.setBulb(b2);
		lamp.on();
	}
}