package general_programming;

import java.util.HashSet;
import java.util.Set;

public class UnionOf2Sets {
    public static void main(String[] args) {
        Set<String> languages1 = new HashSet<>();
        languages1.add("Java");
        languages1.add("Python");
        System.out.println("Programming Languages: " + languages1);

        // create second set
        Set<String> languages2 = new HashSet<>();
        languages2.add("English");
        languages2.add("Spanish");
        System.out.println("Human Language: " + languages2);

        languages1.addAll(languages2);
        System.out.println("Union of the sets: " + languages1);
    }
}
