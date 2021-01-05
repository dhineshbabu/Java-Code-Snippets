package java10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI_Changes {
    public static void main(String[] args) {
        /*
        JAVA10 has provided the following methods to Collectors class to provide Unmodifiable or
        immutable List, Set and Map.
        1) public static List unmodifiableList()
        2) public static Set unmodifiableSet()
        3) public static Map unmodifiableMap()
         */

        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(23);
        al.add(40);
        System.out.println(al);
        Stream<Integer> stream = al.stream();
        List<Integer> newList = stream.filter(n -> n%2 == 0).collect(Collectors.toUnmodifiableList()); //set and map also applicable
        System.out.println(newList);
        newList.add(50); //UnsupportedOperationException
    }
}


