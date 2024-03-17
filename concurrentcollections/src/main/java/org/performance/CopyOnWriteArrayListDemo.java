package org.performance;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> cowal = new CopyOnWriteArrayList<>();
        cowal.add("perf");
        cowal.add("engineer");
        cowal.add("architect");

        Thread modifierThread = new Thread(() -> {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            cowal.add("Tester");
            System.out.println("added Tester");
        });

        Thread iteratorThread = new Thread(() -> {
            Iterator<String> it = cowal.iterator();
            while(it.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
                System.out.println(it.next()); // Tester will not be printed by this thread
            }
        });

        // start the threads
        modifierThread.start();
        iteratorThread.start();

        modifierThread.join();
        iteratorThread.join();

    }
}
