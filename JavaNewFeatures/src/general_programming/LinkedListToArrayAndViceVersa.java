package general_programming;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListToArrayAndViceVersa {
    public static void main(String[] args) {

        //Linked list to Array
        LinkedList<String> languages = new LinkedList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        System.out.println("LinkedList: " + languages);

        String[] arr = new String[languages.size()];
        languages.toArray(arr);
        System.out.println("Array: ");
        System.out.println(Arrays.toString(arr));

        //Array to LinkedList
        String[] array = {"Java", "Python", "C"};
        LinkedList<String> newLinked = new LinkedList<>(Arrays.asList(array));
        System.out.println("New Linked List: ");
        System.out.println(newLinked);
    }
}
