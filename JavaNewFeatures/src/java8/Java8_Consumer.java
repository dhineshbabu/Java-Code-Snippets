package java8;

import java.util.function.Consumer;
class Movie {
    String name;
    String result;

    Movie(String name, String result) {
        this.name = name;
        this.result = result;
    }
}
public class Java8_Consumer {

    public static void main(String[] args) {
        Consumer<String> c = s -> System.out.println(s);
        c.accept("Dhinesh");
        c.accept("Kanu");
        // consumer chanining can be done using andThen() function
        Consumer<Movie> c1 = m -> System.out.println("Name is " + m.name);
        Consumer<Movie> c2 = m -> System.out.println("Result is " + m.result);

        Consumer<Movie> chain = c1.andThen(c2);
        Movie m1 = new Movie("Dhinesh", "Success");
        chain.accept(m1);
    }
}
