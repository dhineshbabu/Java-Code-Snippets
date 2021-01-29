package general_programming;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByeys {
    public static void main(String[] args) {
        // create a hashmap
        Map<String, String> languages = new HashMap<>();
        languages.put("pos3", "JS");
        languages.put("pos1", "Java");
        languages.put("pos2", "Python");
        System.out.println("Map: " + languages);

        //Create a treemap to sort it
        TreeMap<String, String> sortedMap = new TreeMap<>(languages);
        System.out.println("Sorted Map: "+ sortedMap);
    }
}
