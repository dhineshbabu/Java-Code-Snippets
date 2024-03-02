package gfgnotes.maps;
import java.util.*;

public class Prob_PrintFreqInAnArray {

    public static void printFrequency(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> x: hm.entrySet()){
            System.out.println(x.getKey() + " "  + x.getValue());
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 30, 20, 20, 40, 10, 10, 10};

        printFrequency(arr);
    }
}
