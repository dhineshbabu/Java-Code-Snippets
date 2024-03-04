package org.example.forkjoinpooldemo;

import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        long[] array = new long[100];
        // Initialize the array
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        // create a ForkJoinPool
        ForkJoinPool pool = new ForkJoinPool();
        // Create a task to submit
        ForkJoinPoolDemo task = new ForkJoinPoolDemo(array, 0, array.length);
        // assign the task to the pool
        Long result = pool.invoke(task);
        System.out.println("Final Result is: " + result);
    }
}
