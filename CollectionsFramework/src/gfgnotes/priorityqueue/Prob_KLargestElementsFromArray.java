package gfgnotes.priorityqueue;

import java.util.PriorityQueue;

public class Prob_KLargestElementsFromArray {
    /*
    1. Build a min heap of first k elements
    2. Traverse from (k+1) element
        2a. compare the top of the element with the next element in the arary
            if the top is greater then leave it
            else replace the top with the new elements from the arrayu
      3. after final loop, the minHeap will have the k largest contents

     */
    public static void kLargestElements(int[] nums, int k) {
        PriorityQueue<Integer>  pq = new PriorityQueue<>();
        for(int i=0; i<k; i++) {
            pq.add(nums[i]);
        }

        for(int i=k; i<nums.length; i++) {
            if(nums[i] > pq.peek()) {
                pq.poll();
                pq.add(nums[i]);
            }
        }

        for(int i=0; i<k; i++) {
            System.out.println(pq.poll());
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,23,12,9,30,2,50};
        int top = 3;
        kLargestElements(nums, top);
    }
}
