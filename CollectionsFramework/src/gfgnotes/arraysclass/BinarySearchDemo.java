package gfgnotes.arraysclass;

import java.util.Arrays;

public class BinarySearchDemo {
    // binary search works only for sorted arrays
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,34,55,89};
        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr, 100));

        // another version
        System.out.println(Arrays.binarySearch(arr, 3, 6, 55));

        int[] arr2 = {1,2,3,5,34,55,90};
        System.out.println(Arrays.mismatch(arr, arr2));

    }
}
