package java8;

import java.util.function.BiConsumer;

public class Java8_BiConsumer {
    public static void main(String[] args) {
        BiConsumer<String,String> bc = (a,b) -> System.out.println(a+b);
        bc.accept("Dhinesh", "babu");
    }
}
