package general_programming;

import java.util.HashMap;
import java.util.Map;

public class GetHashMapKeyFromValue {
    public static void main(String[] args) {
        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("HashMap: " + numbers);

        int input = 3;

        for(Map.Entry<String, Integer> entry: numbers.entrySet()) {
            if(entry.getValue() == input) {
                System.out.println("Key is : " + entry.getKey());
            }
        }
    }
}
