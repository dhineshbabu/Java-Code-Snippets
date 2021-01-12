package general_programming;

import java.util.ArrayList;

public class PassingLambdaAsMrthodParameter {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        // add elements to the ArrayList
        languages.add("java");
        languages.add("swift");
        languages.add("python");
        System.out.println("ArrayList: " + languages);

        languages.replaceAll(e -> e.toUpperCase());

        System.out.println("Updated Array List");
        System.out.println(languages);
    }
}
