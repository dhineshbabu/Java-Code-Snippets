package gfgnotes.hashset;

import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> s = new LinkedHashSet<>();
        s.add(10);
        s.add(30);
        s.add(20);
        s.add(20);
        System.out.println(s);
        System.out.println(s.contains(20));

        // Normal hashset - No insertion order preserved
        HashSet<Integer> s2 = new HashSet<>();
        s2.add(10);
        s2.add(30);
        s2.add(20);
        System.out.println(s2);
    }
}
