package functionalprogramming.lambdaexp;

import java.util.function.Function;

public class PreDefFunctionalInterfacesFunction {
    public static void main(String[] args) {
        /*
        Function func. interface has a method
        public abstract T apply(U)
         */

        Function<Integer, Integer> f = n -> n* n;
        System.out.println(f.apply(5));
        System.out.println(f.apply(10));
        Function<String, Integer> getLength = s -> s.length();
        System.out.println(getLength.apply("kani"));
        System.out.println(getLength.apply("bru"));

        // Function Chaining with andThen() & compose()
        Function<Integer, Integer> f1 = n -> n*2;
        Function<Integer, Integer> f2 = n -> n*n*n;

        // using andThen - first f1 will execute and then result will be passed to f2
        System.out.println(f1.andThen(f2).apply(5));

        // using compose() - reverse of andThen()
        // here f2 will be called first and then f1
        System.out.println("***** compose *****");
        System.out.println(f1.compose(f2).apply(5));





    }
}
