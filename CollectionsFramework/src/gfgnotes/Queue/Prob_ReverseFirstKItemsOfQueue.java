package gfgnotes.Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;

public class Prob_ReverseFirstKItemsOfQueue {

    /*
    1. Create a stack and put first k items from the queue
    2. pop from stack and add it to the queue
    3. now to organize the first few items that are not reversed, take from the queue and add it to the end of the queue
        n-k items
     */
    public static void reverseK(Queue<Integer> queue, int k) {

        // check base case
        if(queue.size() < k || k <= 0) return;

        // stack can be implemented with ArrayDeque
        Deque<Integer> stack = new ArrayDeque<>();

        // remove the first k element and push to the stack
        for(int i=0; i<k; i++) {
            stack.push(queue.poll());
        }

        // pop the items from stack and add to the end of the queue
        while(stack.isEmpty() == false) {
            queue.offer(stack.pop());
        }

        // take the n-k items from the queue and add it to the end
        for(int i=0; i<queue.size()-k; i++) {
            queue.offer(queue.poll());
        }

    }

    public static void main(String[] args) {

        // Queue<Integer> q = new LinkedList<Integer>();
        Queue<Integer> q = new ArrayDeque<Integer>();

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        int k=3;

        reverseK(q,k);

        System.out.println(q);
    }
}
