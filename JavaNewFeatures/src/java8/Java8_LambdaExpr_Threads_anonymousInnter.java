package java8;

public class Java8_LambdaExpr_Threads_anonymousInnter {

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for(int i=0; i< 10; i++) {
                System.out.println("Child Thread");
            }
        });
        t.start();
        for(int i=0; i< 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
