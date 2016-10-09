import java.util.*;
public class TestMap{
	public static void main(String args[]){
		Map map = new HashMap();

		map.put("2006", "Italy");
		map.put("2002", "Brazil");
		map.put("1998", "France");
		map.put("1994", "Brazil");

		Set set = map.keySet();
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}

		iter = set.iterator();
		while(iter.hasNext()){
			Object key = iter.next();
			Object value = map.get(key);
			//System.out.println(iter.next());
			System.out.println(key + "--->" + value);
		}

		
		Collection conn = map.values();
		iter = conn.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}

		set = map.entrySet();
		iter = set.iterator();
		while(iter.hasNext()){
			Map.Entry entry = (Map.Entry) iter.next();
			System.out.println(entry.getKey() + "--->" + entry.getValue());
		}
	}
}