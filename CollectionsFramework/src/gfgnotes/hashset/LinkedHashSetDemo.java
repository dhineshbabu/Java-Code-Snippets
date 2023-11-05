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
    }
}
