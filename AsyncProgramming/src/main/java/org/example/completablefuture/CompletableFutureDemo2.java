package org.example.completablefuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo2 {
    public static int compute(int n) {
        return n * 2;
    }

    public static CompletableFuture<Integer> create(int n) {
        return CompletableFuture.supplyAsync(() -> compute(n));
    }

    public static void main(String[] args) {
        var cf1 = create(2); // 4
        var cf2 = create(3); // 6

        cf1.thenCombine(cf2, (data1, data2) -> data1 + data2)
                .thenAccept(System.out::println);

        // another variation with compose
        // if your function returns data, use thenApply
        // if your function returns CompletableFuture, use thenCompose
        create(2)
//                .thenApply(data -> create(data))
                .thenCompose(data -> create(data))
                .thenAccept(System.out::println);


    }
}
