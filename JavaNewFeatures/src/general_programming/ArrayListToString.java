package general_programming;

import java.util.ArrayList;

public class ArrayListToString {
    public static void main(String[] args) {
        ArrayList<String> languages= new ArrayList<>();

        // Add elements in the array list
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        System.out.println("ArrayList: " + languages);

        String arrayList = languages.toString();
        System.out.println(arrayList);

        // Using String.join() method
        String al = String.join(", ", languages);
        System.out.println("Using String.join() method: " + al);
    }
}
