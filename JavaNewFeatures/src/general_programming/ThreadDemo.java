package general_programming;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class ThreadDemo {

    public static void main(String[] args) {
        MyThread MT = new MyThread();
        MT.start();
        for (int i = 0; i < 10; i++) {
            if(i==5) {
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName());
        }

    }
}
