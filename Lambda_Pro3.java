package JAVA_08;

public class Lambda_Pro3 implements Navy{

    @Override
    public void sail() {
        System.out.println("navy normal");
    }

    public static void main(String[] args) {
        Lambda_Pro3 r = new Lambda_Pro3();
        r.sail();

        //anonymous
        Navy n = new Navy() {
            @Override
            public void sail() {
                System.out.println("tfd");
            }
        };
        n.sail();

        //lambda
        Navy na = ()->{
            System.out.println("lambda navy");
        };
        na.sail();
    }
}
interface Navy{
    void sail();

}
