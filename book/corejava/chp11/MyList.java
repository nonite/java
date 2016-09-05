public class MyList{
	public static void main(String args[]){
		private Object[] data;
		private int index;
		public MyList{
			data = new Object[5];
			index = 0;
		}

		public void add(Object value){
			if(index == data.length) this.expand();
			data[index] = value;
			index++;
		}
		public void add(int pos, Object value){
			if(index == data.lentgh) this.expand();
			for(int i = index; i>pos;i--){
				data[i] = data[i-1];
			}
			data[pos] = value;
			index++;
		}
		public void delete(int pos){
			for(int i = pos;i<index-1;i++){
				data[i] = data[i+1];
			}
			index--;
		}
		public Object get(int pos){
			return data[pos];
		}
		public int size(){
			return index;
		}
		public boolean contains(Object obj){
			for(int i = 0; i<index;i++){
				if(data[i].equals(obj)) return true;
			}
			return false;
		}
		private void expand(){
			Object[] newArray = new Object[data.length*2];
			for(int i = 0; i<data.length; i++){
				newArray[i] = data[i];
			}
			data = newArray;
		}
	}
}