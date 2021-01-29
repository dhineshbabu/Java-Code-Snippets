package general_programming;

import java.util.HashSet;
import java.util.Set;

public class CheckifSetisSubset {
    public static void main(String[] args) {
        // create the first set
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("Numbers: " + numbers);

        // create the second set
        Set<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("Prime Numbers: " + primeNumbers);

        boolean result = numbers.containsAll(primeNumbers);
        System.out.println("Is the set is subset of Mainset? : " + result);
    }
}
