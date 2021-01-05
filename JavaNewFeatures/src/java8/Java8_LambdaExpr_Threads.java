package java8;

public class Java8_LambdaExpr_Threads {
    public static void main(String[] args) {
        Runnable r = () -> {
            for(int i=0; i< 10; i++) {
                System.out.println("Child Thread");
            }
        };

        Thread t = new Thread(r);
        t.start();
        for(int i=0; i< 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
