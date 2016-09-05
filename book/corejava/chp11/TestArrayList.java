public class TestArrayList{
	public static void main(String args[]){
		List list = new ArrayList();
		list.add("Hello");
		list.add("world");
		list.add("java");
		list.add("study");

		for(int i = 0; i <list.size(); i++){
			System.out.println(list.get(i));
		}

		Iterator iter = list.iterator();
		while(iter.hasNext()){
			Object value = iter.next();
			System.out.println(value);
		}
	}
}