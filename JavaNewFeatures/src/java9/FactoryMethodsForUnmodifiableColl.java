package java9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethodsForUnmodifiableColl {
    public static void main(String[] args) {
        // From java 9, of() method is used to create unmodifiable collection ( for list, set and map)
        List<String> beers = List.of("KO", "KC", "FI", "RC");
        //Sets
        Set<Integer> s = Set.of(10,20,30);
        //Maps
        Map<String, String> m = Map.of("A", "Dhinesh", "B", "Babu");
        //Another way of adding entries
        Map.Entry<String, String> e1 = Map.entry("K", "Kanu");
        Map.Entry<String, String> e2 = Map.entry("H", "Hasini");
        Map.Entry<String, String> e3 = Map.entry("B", "Bru");
        Map<String, String> m1 = Map.ofEntries(e1,e2,e3);
        System.out.println(m1);
    }
}
