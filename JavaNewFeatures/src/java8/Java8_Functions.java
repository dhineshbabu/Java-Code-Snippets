package java8;

import java.util.function.Function;

public class Java8_Functions {
    public static void main(String[] args) {
        Function<String, Integer> f = s-> s.length();
        System.out.println(f.apply("Dhinesh"));
        System.out.println(f.apply("kanu"));
        //Program to find Number of spaces present in the given String by
        //using Function
        Function<String, Integer> f1 = s1 -> s1.length() - s1.replaceAll(" ", "").length();
        System.out.println(f1.apply("Dhinesh babu"));
    }
}
