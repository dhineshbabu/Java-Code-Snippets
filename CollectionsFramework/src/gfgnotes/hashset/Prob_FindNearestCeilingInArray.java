package gfgnotes.hashset;

import java.util.TreeSet;

public class Prob_FindNearestCeilingInArray {

    public static void nearestCeiling(int[] arr) {
        TreeSet<Integer> ts = new TreeSet<>();
        int[] res = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--) {
            Integer ceil = ts.ceiling(arr[i]);
            if(ceil == null) {
                res[i] = -1;
            } else {
                res[i] = ceil;
            }
            ts.add(arr[i]);
        }

        for(int x: res) {
            System.out.println(x+ " ");
        }

    }
    public static void main(String[] args) {
        int[] arr = {10, 100, 200, 30, 120, 120};
        nearestCeiling(arr);
    }
}
