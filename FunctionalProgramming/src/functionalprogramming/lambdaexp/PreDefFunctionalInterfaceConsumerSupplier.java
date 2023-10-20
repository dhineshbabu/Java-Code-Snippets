package functionalprogramming.lambdaexp;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class PreDefFunctionalInterfaceConsumerSupplier {
    public static void main(String[] args) {
        // Consumer
        // It has a method - accept() - it just accept but doesnot return anything
        Consumer<String> c = System.out::println;
        c.accept("kani");
        // using andThen() method - consumer chaining
        // We can add any number of consumers in the chain
        Consumer<String> c2 = s -> System.out.println("The end");
        c.andThen(c2).accept("bru");

        System.out.println("****** SUPPLIER ******");

        // Supplier
        // It has get() method - it does not take any input but it returns some element
        Supplier<Date> s = Date::new;
        System.out.println(s.get());

    }
}
