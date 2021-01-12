package general_programming;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorOnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("ArrayList: " + numbers);

        ListIterator<Integer> itr = numbers.listIterator();
        System.out.println("Iterating over ArrayList");
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
