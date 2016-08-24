public class TestCreditCard{
	public static void main(String args[]){
		CreditCard card = new CreditCard();
		System.out.println(card.getPassword());
		card.setPassword("00000");
		System.out.println(card.getPassword());
	}
}
class CreditCard{
	private String password = "123456";
	public void setPassword(String password){
		if(password.length() != 6) return;
		this.password = password;
	}
	public String getPassword(){
		return this.password;
	}
}