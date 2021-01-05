package java8;

import java.util.function.BiPredicate;

public class Java8_BiPredicate {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> bp = (a,b) -> (a+b) % 2 ==0;
        System.out.println(bp.test(1,2));
        System.out.println(bp.test(2,2));
    }
}
