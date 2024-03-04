package org.example.singlethreadexecutordemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class SingleThreadExecutorDemo {
    public static void main(String[] args) throws InterruptedException{
        ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            int temp = i;

            singleThreadPool.execute(() -> {
                String threadName = Thread.currentThread().getName();
                System.out.println("Task Running now is "+ temp + " on Thread : " + threadName );
            });
        }

        singleThreadPool.shutdown();
    }
}
