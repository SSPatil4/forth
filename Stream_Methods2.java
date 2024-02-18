package JAVA_08;

import Collection_PAckage.Comparator_Program;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Methods2 {
    public static void main(String[] args) {
        List<String> ref = new ArrayList();
        ref.add("vinayak");
        ref.add("ganesha");
        ref.add("shri");
        ref.add("rama");
        ref.add("hanuman");
        ref.add("ganesha");
        ref.add("venkatesha");
        ref.add("govinda");
        ref.add("maruti")   ;
        ref.add("kesari");

//        ref.stream().filter((String name)-> name.length()>4).sorted().distinct().forEach(System.out::println);

      /*Object[] ok= ref.stream().sorted((String name1,String name2 )-> name1.length()-name2.length()).toArray();
        System.out.println(ok);*/

//        ref.stream().sorted((String name1,String name2 )-> name1.length()-name2.length()).forEach(System.out::println);

//        ref.stream().map(String::toUpperCase).sorted((String name1,String name2)->name1.length()-name2.length()).forEach(System.out::println);

//        Stream<Integer> numberArray = Stream.of(8,4,5,7,8,1,58947,8,45,4,4,8,41,1,64,1);
//        System.out.println(numberArray.count());


//        Stream<String> strStream = Stream.of("ssp","vsp","spp","bsp");
//        strStream.sorted().forEach(System.out::println);


//       int sum= Arrays.stream(new int[]{4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}).reduce(0,(a,b)->a+b);
//        System.out.println(sum);

//      OptionalInt jj = Arrays.stream(new int []{1,2,3,4,5,6,7,8,9,8,8,8,8,8,8,8}).reduce((a,b)->a*b);
//        System.out.println("reduce "+jj);


//        ref.stream().distinct().forEach(System.out::println);
//        ref.stream().filter((String dk)->dk.length()>5).forEach(System.out::println);
//        ref.stream().map(e->e.length()==4).forEach(System.out::println);
//        ref.stream().sorted().forEach(System.out::println);
//        ref.stream().limit(4).forEach(System.out::println);
//        ref.stream().skip(7).forEach(System.out::println);

       /*if (ref.stream().anyMatch(e->e.startsWith("z"))){
           System.out.println("true");
       }else{
           System.out.println("false");
       }*/

        /*if (ref.stream().noneMatch(e->e.equals("manoj"))){
            System.out.println("true");
        }else{
            System.out.println("false");
        }*/

        /*if (ref.stream().allMatch(e->e.length()>2)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }*/

       /* OptionalInt obj = Arrays.stream(new int []{12,14,25,36,45,78,96,100}).max();
        System.out.println("maximum number is "+obj);*/

        /*OptionalInt obj1 = Arrays.stream(new int[]{14,56,78,45,62,114,120,100,11,111,7}).min();
        System.out.println("min number is "+obj1);*/

        Optional <String> obj2= ref.stream().findFirst();
        System.out.println(obj2);

        Optional<String> obj3= ref.stream().findAny();
        System.out.println(obj3);

//        ref.stream().filter(f->f.contains("Vinayak")).forEach(System.out::println);

//        ref.stream().filter(f->f.length()>7).peek(e-> System.out.println(e)).toArray();
//        ref.stream().map(String::toUpperCase).forEach(System.out::println);

//        ref.stream().map(String::toUpperCase).forEach(System.out::println);

//        Object[] arr = ref.stream().toArray();
//        System.out.println(arr);

//        ref.stream().sorted((String name1,String name2)->name1.length()-name2.length()).forEach(System.out::println);


    }
}
