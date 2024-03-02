package gfgbasics;

import java.util.*;

public class MethodRefDemo {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1,2,23,4);
        al.forEach(System.out::println);

    }
}
