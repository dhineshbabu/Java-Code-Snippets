package general_programming;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorOnSets {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("Set: " + numbers);


        Iterator<Integer> iterate = numbers.iterator();
        while(iterate.hasNext()){
            System.out.print(iterate.next());
            System.out.print(", ");

        }
    }
}
