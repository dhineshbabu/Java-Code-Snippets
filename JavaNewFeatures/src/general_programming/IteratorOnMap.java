package general_programming;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorOnMap {
    public static void main(String[] args) {
        HashMap<String, String> languages = new HashMap<>();
        languages.put("Java", "Enterprise");
        languages.put("Python", "ML/AI");
        languages.put("JavaScript", "Frontend");
        System.out.println("HashMap: " + languages);

        Iterator<Map.Entry<String, String>> iterator1 = languages.entrySet().iterator();
        System.out.println("Entries");
        while(iterator1.hasNext()){
            System.out.print(iterator1.next());
            System.out.print(", ");
        }

        //Iterator for keys
        Iterator<String> iterator2 = languages.keySet().iterator();
        System.out.println("\nKeys");
        while(iterator2.hasNext()) {
            System.out.print(iterator2.next());
            System.out.print(", ");
        }

        //Iterator for values
        Iterator<String> iterator3 = languages.values().iterator();
        System.out.println("\nvalues");
        while (iterator3.hasNext()){
            System.out.print(iterator3.next());
            System.out.print(", ");
        }

    }
}
