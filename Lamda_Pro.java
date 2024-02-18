package JAVA_08;

interface lam {    //SAM interface
    public abstract void add();
}


public class Lamda_Pro implements lam {
    @Override
    public void add() {
        System.out.println("normal overriding ");
    }

    public static void main(String[] args) {
        //Normal overriding
        Lamda_Pro reff = new Lamda_Pro();
        reff.add();


        //Anonymous inner class
        lam l = new lam() {
            @Override
            public void add() {
                System.out.println("anonymous inner class");

            }
        };
        l.add();


        // Using lambda
        lam l1 = () -> {
            System.out.println("using lambda");
        };
        l1.add();

    }
}
