package java9.streamapichanges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<Integer>();
        for (int i = 0; i <=10; i++) {
            l1.add(i);
        }

        //takeWhile() method
        List<Integer> l2 = l1.stream().takeWhile(i -> i <5).collect(Collectors.toList());
        System.out.println(l2);

        //dropWhile() method
        List<Integer> l3 = l1.stream().dropWhile(i -> i <5).collect(Collectors.toList());
        System.out.println(l3);

        //Another dropWhile() example
        Stream.of("A","AA","BBB","CCC","CC","C" ).dropWhile(s -> s.length() <=2).forEach(System.out::print);

        //Stream.iterate() method
        System.out.println("From Stream.iterate() method");
        Stream.iterate(1, x-> x+1).limit(5).forEach(System.out::print);

        //Stream.iterate() with 3 arguments (to limit the number of iterations with a predicate
        System.out.println("Predicate with 3 arguments");
        Stream.iterate(1, x->x<5, x -> x+1).forEach(System.out::print);

        //ofNullable() method
        List l4 = Stream.ofNullable(100).collect(Collectors.toList());
        System.out.println();
        System.out.println(l4);
        List l5 = Stream.ofNullable(null).collect(Collectors.toList());
        System.out.println(l5); // This will return empty list

        // Demo for ofNullable() method - usually we use this method with flatMap method in streams
        List<String> l6=new ArrayList<String>();
        l6.add("A");
        l6.add("B");
        l6.add(null);
        l6.add("C");
        System.out.println("Before applying ofNullable method");
        System.out.println(l6);
        List<String> l7 = l6.stream().flatMap(o -> Stream.ofNullable((o))).collect(Collectors.toList());
        System.out.println("After applying ofNullable() method to remove null values");
        System.out.println(l7);

        //Using ofNullable with maps
        Map<String,String> m=new HashMap<>();
        m.put("A","Apple");
        m.put("B","Banana");
        m.put("C",null);
        m.put("D","Dog");
        m.put("E",null);
        List<String> l8 =m.entrySet().stream().flatMap(e -> Stream.ofNullable(e.getValue())).collect(Collectors.toList());
        System.out.println("After applying ofNullable for map");
        System.out.println(l8);
    }
}
