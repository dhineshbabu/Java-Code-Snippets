package java8;

import java.util.Date;
import java.util.function.Supplier;

public class Java8_Supplier {
    public static void main(String[] args) {
        Supplier<String> s = () -> {
            String[] s1 = {"Dhinesh", "Babu", "Kanu", "Hasini"};
            int x = (int) (Math.random()*4);
            return s1[x];
        };

        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());

        //Supplier for system date

        Supplier<Date> date = () -> new Date();
        System.out.println(date.get());
        System.out.println(date.get());
        System.out.println(date.get());

        System.out.println(Math.random());

    }
}
