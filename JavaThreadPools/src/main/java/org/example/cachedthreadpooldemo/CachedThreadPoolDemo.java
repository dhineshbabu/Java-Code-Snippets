package org.example.cachedthreadpooldemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class CachedThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService cachedPool = Executors.newCachedThreadPool();
        // submitting the task to the thread pool
        for (int i = 0; i < 10; i++) {
            int temp = i;
            cachedPool.execute(() -> {
                int threadCount = ((ThreadPoolExecutor) cachedPool).getPoolSize();
                String threadName = Thread.currentThread().getName(); // Get current thread name
                System.out.println("Task Running now is "+ temp + " on Thread : " + threadName + " & Current Thread Count: " + threadCount);
            });
        }

        int threadCountFinal = ((ThreadPoolExecutor) cachedPool).getPoolSize();

        Thread.sleep(10000);
        System.out.println("Final Thread Count: " + threadCountFinal);

        cachedPool.shutdown();
    }
}
