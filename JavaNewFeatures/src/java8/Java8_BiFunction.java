package java8;

import java.util.function.BiFunction;

public class Java8_BiFunction {

    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> bf = (a,b) -> a+b;
        System.out.println(bf.apply(10,20));
    }
}
