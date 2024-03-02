package multithreading.module01general;

public class Prob_02Method2 {
    private static class PerformanceThread extends Thread{
        public void run(){
            System.out.println("Hello from " + this.getName());
        }
    }

    public static void main(String[] args) {
        // Create an instance for the thread class and call the start method
        PerformanceThread perfThread = new PerformanceThread();
        perfThread.setName("Performance Thread");
        perfThread.start();
    }
}
