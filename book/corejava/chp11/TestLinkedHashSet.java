import java.util.*;
public class TestLinkedHashSet{
	public static void main(String args[]){
		Set set = new LinkedHashSet();
		set.add("hello");
		set.add("world");
		set.add("java");
		set.add("hello");

		Iterator iter = set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
}