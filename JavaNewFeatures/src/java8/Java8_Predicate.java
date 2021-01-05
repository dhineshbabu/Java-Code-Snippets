package java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Java8_Predicate {
    public static void main(String[] args) {
        Predicate<Integer> p = I -> (I > 10);
        System.out.println(p.test(100));
        System.out.println(p.test(9));
        // we can only use integer for testing since we use <Integer> in the generic
        //write a predicate to check whether the given collection is empty or not.
        Predicate<Collection> p1 = c -> c.isEmpty();
        List<Integer> al = new ArrayList();
        al.add(10);
        al.add(20);
        System.out.println(p1.test(al));

        /*
        *It’s possible to join predicates into a single predicate by using the following methods.
        and()
        or()
        negate()
        * */
        int[] i = {0, 5, 10, 15, 20, 25, 30};
        Predicate<Integer> p3 = i1 -> (i1 > 10);
        Predicate<Integer> p4 = i2 -> i2 % 2 == 0;
        System.out.println("Numbers greater than 10 ");
        m1(p3, i);
        System.out.println("Numbers not greater than 10 ");
        m1(p3.negate(), i);

        System.out.println("Numbers greater than 10 and Even");
        m1(p3.and(p4), i);

    }
        public static void m1(Predicate<Integer> p, int[] x) {
           for(int x1: x) {
               if(p.test(x1)) {
                   System.out.print(x1+"\t");

               }
           }
            System.out.println("\n");
        }

    }

