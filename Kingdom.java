public class Kingdom{
	private String name;
	
	public String getName(){
		return name;
	}
	
	public void setName(String N){
		this.name=N;
	}
	
	
	
}

class Ssp extends Kingdom{
	public static void main(String []args){
		Kingdom obj = new Kingdom();
		obj.setName("Saurabh S Patil");
		obj.setName("Shankarrao");
		System.out.println("Print the name "+obj.getName());
		
		System.out.println(obj.name("Patil"));
	}
	
}