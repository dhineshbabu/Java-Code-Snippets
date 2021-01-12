package general_programming;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Fibonaaci series");
        int num = 10, t1=0, t2=1;
        for (int i = 1; i <=num ; i++) {
            System.out.print(t1 + ", ");
            int sum = t1+t2;
            t1 = t2;
            t2 = sum;
        }
    }

}
