package org.example.scheduledthreadpooldemo;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException{
        ScheduledExecutorService scheduledThreadPool =
                Executors.newScheduledThreadPool(5);

        // Task is running after 5 seconds.
        scheduledThreadPool.schedule(() -> {
            System.out.println("Task will be running after 5 seconds");
        }, 5, TimeUnit.SECONDS);

        // Task is running for every 2 seconds
        scheduledThreadPool.scheduleAtFixedRate(() -> {
            System.out.println("Task is running repeatedly every 2 seconds.");
        }, 0, 2, TimeUnit.SECONDS);

        scheduledThreadPool.shutdown();

        /*
        Task is running repeatedly every 2 seconds.
        Task is running repeatedly every 2 seconds.
        Task is running repeatedly every 2 seconds.
        Task will be running after 5 seconds
        Task is running repeatedly every 2 seconds.
         */

    }
}
