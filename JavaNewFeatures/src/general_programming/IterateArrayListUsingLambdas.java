package general_programming;

import java.util.ArrayList;

public class IterateArrayListUsingLambdas {
    public static void main(String[] args) {
        // create an ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // add elements to the ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");

        // print arraylist
        System.out.print("ArrayList: ");

        languages.forEach((e) -> {
            System.out.print(e + ", ");
        });
    }
}
