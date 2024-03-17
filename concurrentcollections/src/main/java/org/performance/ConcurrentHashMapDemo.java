package org.performance;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        // Create a new HashMap
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Add items to the map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Print the map
        System.out.println("The initial map: " + map);

        // Update the entry
        map.put("one", 11);

        // Concurrently compute a value for a key
        map.compute("four", (key, val) -> val == null ? 1 : val + 1);

        // Iterate over the map
        map.forEach((key, value) -> System.out.println(key+" = "+ value));

        // Remove an entry
        map.remove("two");

        // Check if a value exists
        System.out.println("Contains value 3: "+ map.containsValue(3));

        // Print the updated map
        System.out.println();
        System.out.println("Updated map: " + map);
    }
}
