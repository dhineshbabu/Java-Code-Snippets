package gfgnotes.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Prob_MaxOfAllSubarrysOfSizeK {


    // brute force
    public static void maxSubarraysSizeK(int[] arr, int k) {
        for(int i=0; i<= arr.length-k; i++) {
            int max = arr[i];
            for(int j=i+1; j<i+k; j++) {
                max = Math.max(max, arr[j]);
            }
            System.out.print(max+" ");
        }
    }

    // using deque
    public static void maxSubarraysSizeKUsingDeque(int[] arr, int k) {

        Deque<Integer> dq = new ArrayDeque<>();

        // for first window of items
        for(int i=0; i<k; i++) {
            while(!dq.isEmpty() && arr[i] >=arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }

        //for the rest of the windows
        for(int i=k; i<arr.length; i++) {
            System.out.print(arr[dq.peek()] + " ");
            // check if the element in the dq is eligible for the current window else remove
            while(!dq.isEmpty() && dq.peek() <=i-k) {
                dq.removeFirst();
            }
            // repeat the same oeration to keep the dq is descending order
            while (!dq.isEmpty() && arr[i] >=arr[dq.peekLast()])
                dq.removeLast();
            dq.addLast(i);
        }
        System.out.print(arr[dq.peek()] + " ");
    }

    public static void main(String[] args) {
        int[] nums = {1,8,5,12,15,7,6};
        maxSubarraysSizeK(nums, 3);
        System.out.println();
        maxSubarraysSizeKUsingDeque(nums, 3);
    }
}
