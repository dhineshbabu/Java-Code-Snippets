package general_programming;

import java.util.stream.Stream;

public class TestProgram {

    public static void main(String[] args) throws InterruptedException{
//        Thread t = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("From child thread..");
//            }
//        });
//        t.start();
//
//        Thread.sleep(100);
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Main thread .. .");
//        }

        Double[] d = {0.4, 4.2, 4.3, 5.4, 2.4};
        Stream<Double> s1 = Stream.of(d);
        s1.forEach(System.out::println);


    }
}
