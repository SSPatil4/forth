package JAVA_08;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Methods {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Agni");
        list.add("Java");
        list.add("Bharat");
        list.add("Alpha");
        list.add("Rama");
        list.add("Ganesh");
        list.add("Hanuman");
        list.add("Hanuman");
//        list.add("Angad");
//        list.add("Amrit");
//        list.add("Kamal");
//        list.add("Maruti");
//        list.add("Surya");
//        list.add("Surya");
//        list.add("Prabhakar");

//        List<String> ref23 = list.stream().filter(s -> s.startsWith("H")).distinct().collect(Collectors.toList());
//        System.out.println(ref23);

//        list.stream().sorted().forEach(System.out::println);  // alphabetical sorting order
//        list.stream().sorted((String s1,String s2)->s1.length()-s2.length()).forEach(System.out::println);  // length sorting
//        list.stream().distinct().forEach(System.out::println); // unique elements
//        list.stream().limit(1).forEach(System.out::println); // prints upto given limit
//        list.stream().skip(3).forEach(System.out::println); //skips till given number
//        list.stream().map(String::length).forEach(System.out::println); //gives length

       /* List<String> ref = list.stream().limit(3).skip(2).collect(Collectors.toList());
        System.out.println(ref);*/

        /*OptionalInt jj = Arrays.stream(new int[]{1,2,5,8,7,9,3}).min();
        OptionalInt j1 = Arrays.stream(new int[]{1,2,5,8,7,9,3}).max();
        System.out.println(j1);
        System.out.println(jj);*/

       /* long countList = list.stream().count();
        System.out.println("gives size "+countList);*/

        /*if (list.stream().anyMatch((String name) -> name.length() == 4))
        {
            System.out.println("print if true");
        }*/

        /*if(list.stream().allMatch((String name)->name.length()>4)){
            System.out.println("print true");
        }else{
            System.out.println("print false");
        }*/

       /* if(list.stream().noneMatch((String name)->name.length()==3)){
            System.out.println("true");
        }else {
            System.out.println("elements are small");
        }*/

        /*Optional <String> firstElement = Stream.of("list","saurabh","shubham","akash").findFirst();
        System.out.println(firstElement);*/

//        Optional op = list.stream().findAny();
//        System.out.println(op);

//        Stream.of("first","second","third","forth","five").limit(3).distinct().forEach(System.out::println);

//        Optional oo =Stream.of("first","second","third","forth","five").findAny();
//        System.out.println(oo);


//        Object [] array = list.stream().limit(4).toArray();
//        System.out.println(Arrays.toString(array));

        /*Object[] opnl = list.stream()
                .filter( name -> name.length() > 4)
                .peek(e -> System.out.println("filtered " + e))
                .map(String::toUpperCase)
                .peek(e1 -> System.out.println("mapped " + e1)).toArray();
        System.out.println(opnl);*/

       /* list.stream().filter(name->name.length()>5).peek(e-> System.out.println("filtered in peek "+e))
                .map(String :: toUpperCase)
                .peek(e-> System.out.println("mapped in peek "+e)).toArray();*/



    }
}
