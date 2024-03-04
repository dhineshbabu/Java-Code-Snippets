package org.example.forkjoinpooldemo;

import java.util.concurrent.RecursiveTask;

public class ForkJoinPoolDemo extends RecursiveTask<Long> {
    private final long[] array;
    private final int low;
    private final int high;

    public ForkJoinPoolDemo(long[] array, int low, int high) {
        this.array = array;
        this.low = low;
        this.high = high;
    }

    @Override
    protected Long compute() {
        if(high-low <= 10) {
            // if the task is small then to the normal calculation
            long sum = 0;
            for (int i = low; i < high; i++) {
                sum += array[i];
            }

            return sum;
        } else {
            // if the task is too large then use the fork/join technique
            int mid = (low + high) / 2;
            ForkJoinPoolDemo left = new ForkJoinPoolDemo(array, low, mid);
            ForkJoinPoolDemo right = new ForkJoinPoolDemo(array, mid, high);
            left.fork();
            Long rightResult = right.compute();
            Long leftResult = left.join();
            return leftResult + rightResult;
        }
    }
}


