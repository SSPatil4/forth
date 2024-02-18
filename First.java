public interface First{
void blank();
void space();

}

class Second implements First{

public void blank (){
System.out.println("hello blank");
}

public void space(){
System.out.println("hello space");

}
public static void main(String [] args){
Second obj = new Second ();
obj.space();
obj.blank();
}

} 