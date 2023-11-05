package gfgnotes.priorityqueue;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.List;


public class Prob_PuchasingMaxItems {
    public static int maxPurchaseItems(List<Integer> items, int sum) {
        // initiate a priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(items);
        int result = 0;
        while(sum >= 0 && pq.isEmpty()==false && pq.peek() <= sum) {
            sum = sum - pq.poll();
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[] num = {1, 12, 5, 111, 200};

        System.out.println(maxPurchaseItems(Arrays.asList(num), 10));
    }
}
