package org.example.fixedthreadpooldemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class FixedThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);

        // submitting the task to the thread pool
        for (int i = 0; i < 10; i++) {
            int temp = i;
            fixedThreadPool.execute(() -> {
                int threadCount = ((ThreadPoolExecutor) fixedThreadPool).getPoolSize();
                String threadName = Thread.currentThread().getName(); // Get current thread name
                System.out.println("Task Running now is "+ temp + " on Thread : " + threadName + " & Current Thread Count: " + threadCount);
            });
        }

        int threadCountFinal = ((ThreadPoolExecutor) fixedThreadPool).getPoolSize();

        Thread.sleep(10000);
        System.out.println("Final Thread Count: " + threadCountFinal);

        fixedThreadPool.shutdown();
    }
}
