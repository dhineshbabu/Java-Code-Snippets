package multithreading.deadlockdemo;

public class DeadLockDemo {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        // Creating thread1
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1 acquired lock 1");
                try{
                    Thread.sleep(100);
                } catch (InterruptedException ex){
                    ex.printStackTrace();
                }
                System.out.println("Thread 1 is trying to acquire lock2");
                synchronized (lock2){
                    System.out.println("Thread 1 acquired lock 2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2 acquired lock 2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex){
                    ex.printStackTrace();
                }
                System.out.println("Thread 2 is trying to acquire lock 1");
                synchronized (lock1) {
                    System.out.println("Thread 2 acquired lock 1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
