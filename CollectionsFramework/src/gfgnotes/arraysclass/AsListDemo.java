package gfgnotes.arraysclass;

import java.util.*;

public class AsListDemo {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,2};
        List<Integer> list = Arrays.asList(arr);
        System.out.println(list);

        // For HashSet
        HashSet<Integer> hs = new HashSet<>(Arrays.asList(arr));
        System.out.println(hs);
    }
}
