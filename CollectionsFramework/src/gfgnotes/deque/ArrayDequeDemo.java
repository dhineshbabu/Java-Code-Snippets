package gfgnotes.deque;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.push(10);
        adq.push(20);
        adq.push(30);

        System.out.println(adq);

        System.out.println(adq.peek());

        // ArrayDeque as queue
        ArrayDeque<Integer> adqQ = new ArrayDeque<>();
        adqQ.offer(10);
        adqQ.offer(20);
        adqQ.offer(30);

        System.out.println(adqQ);

        ArrayDeque<Integer> adqQ2 = new ArrayDeque<>();
        adqQ2.addLast(10);
        adqQ2.addLast(20);
        adqQ2.addLast(30);

        System.out.println(adqQ2);
        System.out.println(adqQ2.removeLast());
        adqQ2.addFirst(40);
        System.out.println(adqQ2);
    }
}
