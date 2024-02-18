package JAVA_08;

// Backward Compatibility Program

public class SAM_Functional_Interface {
    public static void main(String[] args) {
        One o = new One();
        o.show();

        Two t = new Two();
        t.show();

        Three t3= new Three();
        t3.show();

        Four f = new Four();
        f.show();

        Five f5 = new Five();
        f5.show();

        Sam.seen();
    }
}
@FunctionalInterface
interface Sam {          //SAM(single abstract method ) or Functional Interface
    void show();
   default void see(){
       System.out.println("default see ");
   }
    static void seen(){
        System.out.println("static seen method ");
    }
//    void add();   //If we declare an interface @Functional Interface cannot take more than one abstract method

    public static void main(String[] args) {
        seen();
    }

}

class One implements Sam {

    @Override
    public void show() {
        System.out.println("print One ");
    }

}

class Two implements Sam {

    @Override
    public void show() {
        System.out.println("print Two ");
    }
}

class Three implements Sam {

    @Override
    public void show() {
        System.out.println("print Three ");
    }
}

class Four implements Sam {

    @Override
    public void show() {
        System.out.println("print Four ");
    }
}

class Five implements Sam {

    @Override
    public void show() {
        System.out.println("print Five ");
    }
}

