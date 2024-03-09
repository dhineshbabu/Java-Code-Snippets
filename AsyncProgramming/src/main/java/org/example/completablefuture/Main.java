package org.example.completablefuture;

import java.util.concurrent.CompletableFuture;

public class Main {

    // some random function
    public static int compute(int n){
        System.out.println("compute called... with n value as " + n);
        try{ Thread.sleep(100); } catch ( Exception e ){}
        return n*2;
    }

    // Method that return a completable future
    public static CompletableFuture<Integer> create(int n){
        return CompletableFuture.supplyAsync( () -> compute(n));
    }

    // Another way of CompletableFuture
    public static CompletableFuture<Integer> create_v2(int n){
        var cf = new CompletableFuture<Integer>();
        cf.thenApply(data -> data * 10)
                .thenApply(data -> data + 1);
        return cf;
    }


    public static void main(String[] args) {

        create(4)
                .thenApply(data -> {
                    System.out.println(Thread.currentThread());
                    return data + 1;
                })
                .thenAccept(System.out::println)
                        .thenRun(() -> System.out.println("Log some information"))
                                .thenRun(() -> System.out.println("some post op"));

        System.out.println("Started the computation: " + Thread.currentThread());
        try{ Thread.sleep(2000); } catch ( Exception e ){}

        // calling the second method create_v2
        CompletableFuture<Integer> cf = create_v2(6);
        System.out.println(cf.complete(compute(6)));

        try {
            Thread.sleep(200); // Ensure all async operations have completed before exiting
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}