package JAVA_08;

public class Lambda_Pro4 {
}
interface LamOne{
    public abstract void addition(int a,int b);
}

class LamOne_Pro implements LamOne{
    @Override
    public void addition (int a,int b){
        int sum =a+b;
        System.out.println("normal override of LamOne "+sum);
    }

    public static void main(String[] args) {
        LamOne_Pro refLam = new LamOne_Pro();
        refLam.addition(100,901);

        //anonymous class
        LamOne lo = new LamOne(){
            @Override
            public void addition (int a,int b){
                int sum1 =a+b;
                System.out.println("anonymous class of LamOne "+sum1);
            }
        };
        lo.addition(100,900);

        //Using lambda
        LamOne ll = (int a,int b) -> {
            int sum2=a+b;
            System.out.println("using lambda "+sum2);
        };
        ll.addition(100,899);


    }
}