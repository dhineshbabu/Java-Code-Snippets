package gfgnotes.Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> qArDeq = new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q);
        System.out.println(q.peek()); // top element to be removed
        System.out.println(q.peek());

    }
}
