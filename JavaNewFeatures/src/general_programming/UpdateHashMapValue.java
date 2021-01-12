package general_programming;

import java.util.HashMap;

public class UpdateHashMapValue {
    public static void main(String[] args) {
        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        System.out.println("HashMap: " + numbers);

        numbers.computeIfPresent("Second", (key, oldvalue) -> oldvalue*2);
        System.out.println("New Hashmap: " + numbers);
    }

}
