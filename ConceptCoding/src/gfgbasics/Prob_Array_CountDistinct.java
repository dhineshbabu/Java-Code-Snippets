package gfgbasics;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Prob_Array_CountDistinct {
    public static void countDistinct(Integer[] arr) {
        HashSet<Integer> hs = new HashSet(Arrays.asList(arr));
//        for (int num : arr) {
//            hs.add(num);
//        }
        System.out.println(hs.size());

    }

    public static void main(String[] args) {
        Integer[] arr = {10, 20, 20, 30, 30, 40, 10};
        countDistinct(arr);
    }
}
