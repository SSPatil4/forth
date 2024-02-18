package JAVA_08;

import java.util.*;
import java.util.stream.Collectors;

public class Stream_Methods1 {
    public static void main(String[] args) {
        List<String> ref = new LinkedList<>();
        ref.add("ssp");
        ref.add("vsp");
        ref.add("bsp");
        ref.add("abhi");
        ref.add("angad");
        ref.add("spp");
        ref.add("spp");
        ref.add("bsp");
        ref.add("sp");



//      ref.stream().forEach(System.out::println);
//        ref.stream().map(String::toUpperCase).forEach(System.out::println);  //upper case
//        ref.stream().filter(e->e.startsWith("s",1)).forEach(System.out::println);
//        ref.stream().filter(e-> e.length()==2).collect(Collectors.toList());
//        ref.stream().map(String :: length).forEach(System.out::println);
//        ref.stream().map(String::hashCode).forEach(System.out::println);
//        ref.stream().map(e->e.startsWith("a")).forEach(System.out::println);
//        ref.stream().distinct().forEach(System.out::println);
       /* List<String> obj1 = ref.stream().filter(f->f.startsWith("a")).distinct().collect(Collectors.toList());
        System.out.println(obj1);*/


        //Collectors class method practice
//       List obj = ref.stream().collect(Collectors.toList());
//        System.out.println(obj);
//        Set oo = ref.stream().collect(Collectors.toSet());
//        System.out.println(oo);

//        Set<String> obj = ref.stream().collect(Collectors.toCollection(HashSet::new));
//        System.out.println(obj);

    }
}
