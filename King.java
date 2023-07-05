public class King{
	Object [] array;
	int s;
	int capacity;
	public King(){
		s=0;
		capacity=10;
		array = new Object[capacity];
		
	}
	
	void add(Object item){
	array[s++]=item;
	}
	
	Object get (int index){
		return array[index];
	} 
	
	int size(){
		return s;
	}
	
	public static void main(String[]args){
		King obj = new King();
		obj.add("Ganesha");
		obj.add("Vinayaka");
		obj.add("Vignaharta");
		obj.add("Ganadhakshya");
		obj.add("Ekdanta");
		obj.add("Lambodara");
		obj.add("Varada");
		obj.add("Ganapati");
		obj.add("Chintamani");
		obj.add(1001);
		
		for(int i=0;i<obj.size();i++){
			
			System.out.println(obj.get(i));

			
		}
	}

}