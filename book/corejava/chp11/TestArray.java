public class TestArray{
	public static void main(String args[]){
		String[] names = new String([3];
		names[0] = "zhang3";
		names[1] = "li4";
		names[2] = "wang5";

		String[] newNames = new String[names.length*2];
		for(int i = 0; i<names.length; i++){
			newNames[i] = names[i];
		}
		names = newNames;
		names[3] = names[2];
		names[2] = names[1];
		names[1] = "zhao6";

		names[2] = names[3;]
	}
}