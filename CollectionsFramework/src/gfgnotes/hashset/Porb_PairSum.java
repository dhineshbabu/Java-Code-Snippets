package gfgnotes.hashset;

import java.util.HashSet;

public class Porb_PairSum {
    public static boolean isPair(int[] arr, int sum) {
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<arr.length; i++) {
            if(hs.contains(sum-arr[i])) {
                return true;
            } else {
                hs.add(arr[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,8,15,-8};
        System.out.println(isPair(arr, 17));
    }
}
