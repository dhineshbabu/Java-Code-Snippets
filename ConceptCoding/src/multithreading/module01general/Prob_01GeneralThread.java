package multithreading.module01general;

public class Prob_01GeneralThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("We are in thread: " + Thread.currentThread().getName());
                System.out.println("Thread priority: " + Thread.currentThread().getPriority());
            }
        });

        // set custom name for the thread
        thread.setName("Performance Thread");
        // set priority
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("We are in thread: " + Thread.currentThread().getName());
        // starting the thread by calling the start() method
        thread.start();
        System.out.println("We are in thread: " + Thread.currentThread().getName());
        Thread.sleep(1000);
    }
}
