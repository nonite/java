import java.util.*;
public class TestLinkedHashMap{
	public static void main(String args[]){
		Map map = new LinkedHashMap();
		map.put("2002", "Brazil");
		map.put("1998", "France");
		map.put("1994", "Brazil");
		map.put("2006", "Italy");

		Set set = map.keySet();
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			Object key = iter.next();
			Object value = map.get(key);
			System.out.println(key + "--->" + value);
		}
	}
}