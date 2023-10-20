package functionalprogramming.lambdaexp;

import java.util.function.Predicate;

public class PreDefFunctionalInterfacesPredicate {
    /*

    All are in java.util.function package

    1. Predicate - it's method is  "public abstract boolean test(Test T)"
    2. Function -
    3. Consumer -
    4. Supplier -
     */
    public static void main(String[] args) {
        // Predicate Demo
        Predicate<Integer> p = i -> i>10;
        System.out.println(p.test(20));
        System.out.println(p.test(5));
        Predicate<String> s  = i -> i.length() > 4;
        System.out.println(s.test("raerwe"));
        System.out.println(s.test("er"));
        //Print array element that string size > 4
        String[] names = {"David", "Kani", "Dhinesh", "Bru"};
        for(String name: names) {
            if(s.test(name)){
                System.out.println("Name is: "+ name);
            }
        }

        // joining 2 predicates (and, or, negate)
        Predicate<Integer> p1 = i -> i%2 == 0;
        Predicate<Integer> p2 = i -> i>50;

        int[] arr = {5,15,20,25,30,45,50,55,65,60};
        System.out.println("**** or ****");
        for(int num: arr) {
            System.out.println(p1.or(p2).test(num));
        }
        System.out.println("**** and ****");
        for(int num: arr) {
            System.out.println(p1.and(p2).test(num));
        }
        System.out.println("**** negate ****");
        for(int num: arr) {
            System.out.println(p1.negate().test(num));
        }

    }



}
