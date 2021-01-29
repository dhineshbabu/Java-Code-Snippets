package general_programming;

import java.util.ArrayList;
import java.util.List;

public class MergingLists {
    public static void main(String[] args) {
        // create first list
        List<Integer> prime = new ArrayList<>();
        prime.add(2);
        prime.add(3);
        prime.add(5);
        System.out.println("First List: " + prime);

        // create second list
        List<Integer> even = new ArrayList<>();
        even.add(4);
        even.add(6);
        System.out.println("Second List: " + even);

        List<Integer> newList = new ArrayList<>();
        newList.addAll(prime);
        newList.addAll(even);

        System.out.println("Merged List: "+ newList);

        //We can create 2 streams and call streams.concat() on them


    }
}
