package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            l1.add(i);
        }
        System.out.println(l1);
        List<Integer> l2 = l1.stream().filter(i -> i%2 ==0).collect(Collectors.toList());
        System.out.println(l2);

        //map() and collect() method
        ArrayList<String> l3 = new ArrayList<>();
        l3.add("Dhinesh");
        l3.add("babu");
        l3.add("kanu");
        l3.add("hasini");
        List<String> l4 = l3.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(l4);
        //count() method
        long count = l3.stream().filter(s->s.length()>=5).count();
        System.out.println("Total number of elements in the list with more than 5 characters " + count);
        //sorted() method
        List<String> l5 = l3.stream().sorted((s1,s2) -> s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println("Sorted List");
        System.out.println(l5);
        // min() and max() methods
        String min = l3.stream().min((s1,s2) -> s1.compareTo(s2)).get();
        System.out.println("Minimum is " + min);
        String max = l3.stream().max((s1,s2) -> s1.compareTo(s2)).get();
        System.out.println("Maximum is " + max);

        //forEach() method
        l3.stream().forEach(System.out::print);

        //toArray() method
        Integer[] ir = l1.stream().toArray(Integer[]::new);
        for(Integer i: ir) {
            System.out.println(i);
        }

        // Stream.of() method
        Stream s = Stream.of(1,20,30,40);
        System.out.println("Printing values created from Stream.of() method");
        s.forEach(System.out::println);
    }
}
